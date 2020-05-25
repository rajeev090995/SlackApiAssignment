package com.plivo.pojo.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel {

@SerializedName("id")
@Expose
private String id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("is_channel")
@Expose
private Boolean isChannel;
@SerializedName("created")
@Expose
private Integer created;
@SerializedName("creator")
@Expose
private String creator;
@SerializedName("is_archived")
@Expose
private Boolean isArchived;
@SerializedName("is_general")
@Expose
private Boolean isGeneral;
@SerializedName("name_normalized")
@Expose
private String nameNormalized;
@SerializedName("is_shared")
@Expose
private Boolean isShared;
@SerializedName("is_org_shared")
@Expose
private Boolean isOrgShared;
@SerializedName("is_member")
@Expose
private Boolean isMember;
@SerializedName("is_private")
@Expose
private Boolean isPrivate;
@SerializedName("is_mpim")
@Expose
private Boolean isMpim;
@SerializedName("last_read")
@Expose
private String lastRead;
@SerializedName("latest")
@Expose
private Object latest;
@SerializedName("unread_count")
@Expose
private Integer unreadCount;
@SerializedName("unread_count_display")
@Expose
private Integer unreadCountDisplay;
@SerializedName("members")
@Expose
private List<String> members = null;
@SerializedName("topic")
@Expose
private Topic topic;
@SerializedName("purpose")
@Expose
private Purpose purpose;
@SerializedName("previous_names")
@Expose
private List<Object> previousNames = null;

/**
* No args constructor for use in serialization
* 
*/
public Channel() {
}

/**
* 
* @param topic
* @param unreadCountDisplay
* @param previousNames
* @param isOrgShared
* @param unreadCount
* @param isMpim
* @param isGeneral
* @param purpose
* @param isArchived
* @param creator
* @param id
* @param created
* @param isPrivate
* @param isChannel
* @param name
* @param isShared
* @param isMember
* @param latest
* @param members
* @param lastRead
* @param nameNormalized
*/
public Channel(String id, String name, Boolean isChannel, Integer created, String creator, Boolean isArchived, Boolean isGeneral, String nameNormalized, Boolean isShared, Boolean isOrgShared, Boolean isMember, Boolean isPrivate, Boolean isMpim, String lastRead, Object latest, Integer unreadCount, Integer unreadCountDisplay, List<String> members, Topic topic, Purpose purpose, List<Object> previousNames) {
super();
this.id = id;
this.name = name;
this.isChannel = isChannel;
this.created = created;
this.creator = creator;
this.isArchived = isArchived;
this.isGeneral = isGeneral;
this.nameNormalized = nameNormalized;
this.isShared = isShared;
this.isOrgShared = isOrgShared;
this.isMember = isMember;
this.isPrivate = isPrivate;
this.isMpim = isMpim;
this.lastRead = lastRead;
this.latest = latest;
this.unreadCount = unreadCount;
this.unreadCountDisplay = unreadCountDisplay;
this.members = members;
this.topic = topic;
this.purpose = purpose;
this.previousNames = previousNames;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Boolean getIsChannel() {
return isChannel;
}

public void setIsChannel(Boolean isChannel) {
this.isChannel = isChannel;
}

public Integer getCreated() {
return created;
}

public void setCreated(Integer created) {
this.created = created;
}

public String getCreator() {
return creator;
}

public void setCreator(String creator) {
this.creator = creator;
}

public Boolean getIsArchived() {
return isArchived;
}

public void setIsArchived(Boolean isArchived) {
this.isArchived = isArchived;
}

public Boolean getIsGeneral() {
return isGeneral;
}

public void setIsGeneral(Boolean isGeneral) {
this.isGeneral = isGeneral;
}

public String getNameNormalized() {
return nameNormalized;
}

public void setNameNormalized(String nameNormalized) {
this.nameNormalized = nameNormalized;
}

public Boolean getIsShared() {
return isShared;
}

public void setIsShared(Boolean isShared) {
this.isShared = isShared;
}

public Boolean getIsOrgShared() {
return isOrgShared;
}

public void setIsOrgShared(Boolean isOrgShared) {
this.isOrgShared = isOrgShared;
}

public Boolean getIsMember() {
return isMember;
}

public void setIsMember(Boolean isMember) {
this.isMember = isMember;
}

public Boolean getIsPrivate() {
return isPrivate;
}

public void setIsPrivate(Boolean isPrivate) {
this.isPrivate = isPrivate;
}

public Boolean getIsMpim() {
return isMpim;
}

public void setIsMpim(Boolean isMpim) {
this.isMpim = isMpim;
}

public String getLastRead() {
return lastRead;
}

public void setLastRead(String lastRead) {
this.lastRead = lastRead;
}

public Object getLatest() {
return latest;
}

public void setLatest(Object latest) {
this.latest = latest;
}

public Integer getUnreadCount() {
return unreadCount;
}

public void setUnreadCount(Integer unreadCount) {
this.unreadCount = unreadCount;
}

public Integer getUnreadCountDisplay() {
return unreadCountDisplay;
}

public void setUnreadCountDisplay(Integer unreadCountDisplay) {
this.unreadCountDisplay = unreadCountDisplay;
}

public List<String> getMembers() {
return members;
}

public void setMembers(List<String> members) {
this.members = members;
}

public Topic getTopic() {
return topic;
}

public void setTopic(Topic topic) {
this.topic = topic;
}

public Purpose getPurpose() {
return purpose;
}

public void setPurpose(Purpose purpose) {
this.purpose = purpose;
}

public List<Object> getPreviousNames() {
return previousNames;
}

public void setPreviousNames(List<Object> previousNames) {
this.previousNames = previousNames;
}

}