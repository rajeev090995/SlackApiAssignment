package com.plivo.util;

import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestCall {
    public Generic generic=new Generic();
     private RequestSpecification requestSpecification = given();

    public void process(Method method,Object pojo){

    }

}
