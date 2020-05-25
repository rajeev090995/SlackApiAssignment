package com.plivo.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("last_set")
    @Expose
    private Integer lastSet;

    /**
     * No args constructor for use in serialization
     */
    public Topic() {
    }

    /**
     * @param value
     * @param lastSet
     * @param creator
     */
    public Topic(String value, String creator, Integer lastSet) {
        super();
        this.value = value;
        this.creator = creator;
        this.lastSet = lastSet;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getLastSet() {
        return lastSet;
    }

    public void setLastSet(Integer lastSet) {
        this.lastSet = lastSet;
    }
}