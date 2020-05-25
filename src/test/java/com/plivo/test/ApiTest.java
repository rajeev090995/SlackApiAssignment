package com.plivo.test;

import com.plivo.pojo.request.RequestSlackApi;
import com.plivo.pojo.response.Channel;
import com.plivo.pojo.response.ResponseSlackApi;
import com.plivo.util.Generic;
import com.plivo.util.RestCall;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTest {


    public static RequestSpecification requestSpecification = given();
    private static Logger logger = Logger.getLogger(ApiTest.class);
    private static String channelName;
    private static String renameChannelName;
    private static String channelID;
    private Response response;
    private ResponseSlackApi responseSlackApi;
    private RequestSlackApi requestSlackApi;
    private Generic generic = new Generic();
    private RestCall restCall=new RestCall();

    void responseToPojoAndValidate() {
        logger.info(response.asString());
        responseSlackApi = response.as(ResponseSlackApi.class, ObjectMapperType.GSON);
        Assert.assertEquals(responseSlackApi.getOk().booleanValue(), true);
        Assert.assertEquals(response.statusCode(), 200);
    }

    @BeforeSuite
    @Parameters({"baseUrl", "token"})
    void configuration(String baseUrl, String token){
        requestSpecification.baseUri(baseUrl);
        requestSpecification.auth().oauth2(token);
    }

    @BeforeMethod
    @Parameters({"basePath"})
    void befreMethodConfig(String basePath) {
        requestSpecification.basePath(basePath);
        requestSlackApi = new RequestSlackApi();
    }

    @Test(priority = 1)
    @Parameters({"name"})
    void createChannel(String name) {
        channelName = name;
        requestSlackApi.setName(name);
        response = requestSpecification.queryParams(generic.queryParam(requestSlackApi)).post();
        responseToPojoAndValidate();
        channelID = responseSlackApi.getChannel().getId();
    }

    @Test(priority = 2)
    void joinChannel() {
        requestSlackApi.setName(channelName);
        response = requestSpecification.queryParams(generic.queryParam(requestSlackApi)).post();
        responseToPojoAndValidate();
    }

    @Test(priority = 3)
    @Parameters({"rename"})
    void renameChannel(String rename) {
        renameChannelName = rename;
        requestSlackApi.setName(renameChannelName);
        requestSlackApi.setChannel(channelID);
        response = requestSpecification.queryParams(generic.queryParam(requestSlackApi)).post();
        responseToPojoAndValidate();
    }

    @Test(priority = 4)
    void listAllChannels() {
        response = requestSpecification.get();
        responseSlackApi = response.as(ResponseSlackApi.class, ObjectMapperType.GSON);
        responseToPojoAndValidate();
        List<Channel> channels = responseSlackApi.getChannels();
        for (int i = 0; i < channels.size(); i++) {
            if (channels.get(i).getId().equals(channelID)) {
                Assert.assertEquals(channels.get(i).getName(), renameChannelName);
            }
        }
    }

    @Test(priority = 5)
    void archiveChannel() {
        requestSlackApi.setChannel(channelID);
        response = requestSpecification.queryParams(generic.queryParam(requestSlackApi)).post();
        responseToPojoAndValidate();
    }

    @Test(priority = 6)
    void validateChannelArchive() {
        requestSlackApi.setChannel(channelID);
        response = requestSpecification.queryParams(generic.queryParam(requestSlackApi)).get();
        responseToPojoAndValidate();
        Assert.assertEquals(responseSlackApi.getChannel().getIsArchived().booleanValue(), true);
    }
}
