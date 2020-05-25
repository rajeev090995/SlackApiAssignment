package com.plivo.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseSlackApi {

    @SerializedName("ok")
    @Expose
    private Boolean ok;
    @SerializedName("channel")
    @Expose
    private Channel channel;
    @SerializedName("channels")
    @Expose
    private List<Channel> channels = null;

    /**
     * No args constructor for use in serialization
     */
    public ResponseSlackApi() {
    }

    /**
     * @param ok
     * @param channel
     */
    public ResponseSlackApi(Boolean ok, Channel channel) {
        super();
        this.ok = ok;
        this.channel = channel;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

}