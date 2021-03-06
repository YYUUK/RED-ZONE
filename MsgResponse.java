package com.geovengers.redzone;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MsgResponse implements Serializable
{

    @SerializedName("location_name")
    @Expose
    private List<String> locationName = null;
    @SerializedName("location_code")
    @Expose
    private String locationCode;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("disaster_group")
    @Expose
    private String disasterGroup;
    @SerializedName("disaster_type")
    @Expose
    private List<String> disasterType = null;
    @SerializedName("disaster_level")
    @Expose
    private List<String> disasterLevel = null;
    @SerializedName("message")
    @Expose
    private List<Message> message = null;
    private final static long serialVersionUID = 7185827017357802485L;

    public List<String> getLocationName() {
        return locationName;
    }

    public void setLocationName(List<String> locationName) {
        this.locationName = locationName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDisasterGroup() {
        return disasterGroup;
    }

    public void setDisasterGroup(String disasterGroup) {
        this.disasterGroup = disasterGroup;
    }

    public List<String> getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(List<String> disasterType) {
        this.disasterType = disasterType;
    }

    public List<String> getDisasterLevel() {
        return disasterLevel;
    }

    public void setDisasterLevel(List<String> disasterLevel) {
        this.disasterLevel = disasterLevel;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

}