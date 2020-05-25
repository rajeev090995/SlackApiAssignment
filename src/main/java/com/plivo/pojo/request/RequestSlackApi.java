package com.plivo.pojo.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestSlackApi {

@SerializedName("name")
@Expose
private String name;
@SerializedName("validate")
@Expose
private Boolean validate;
@SerializedName("channel")
@Expose
private String channel;

/**
* No args constructor for use in serialization
* 
*/
public RequestSlackApi() {
}

/**
* 
* @param name
* @param channel
* @param validate
*/
public RequestSlackApi(String name, Boolean validate, String channel) {
super();
this.name = name;
this.validate = validate;
this.channel = channel;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Boolean getValidate() {
return validate;
}

public void setValidate(Boolean validate) {
this.validate = validate;
}

public String getChannel() {
return channel;
}

public void setChannel(String channel) {
this.channel = channel;
}

}