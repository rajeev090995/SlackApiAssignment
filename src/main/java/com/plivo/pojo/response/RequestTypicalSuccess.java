package com.plivo.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestTypicalSuccess {

@SerializedName("ok")
@Expose
private Boolean ok;

/**
* No args constructor for use in serialization
* 
*/
public RequestTypicalSuccess() {
}

/**
* 
* @param ok
*/
public RequestTypicalSuccess(Boolean ok) {
super();
this.ok = ok;
}

public Boolean getOk() {
return ok;
}

public void setOk(Boolean ok) {
this.ok = ok;
}

}