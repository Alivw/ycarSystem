package com.darksnow.bean;

import java.util.Date;

public class Tcarstop {
    private Integer cid;
    private String carNumber;
    private Integer carTypeId;
    private String carTypeName;
    private String pid;
    private String carPositionNo;
    private Date startTime;
    private Date endTime;
    private Float stopDuration;
    private Float stopCoat;
    private Float price;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCarPositionNo() {
        return carPositionNo;
    }

    public void setCarPositionNo(String carPositionNo) {
        this.carPositionNo = carPositionNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Float getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(Float stopDuration) {
        this.stopDuration = stopDuration;
    }

    public Float getStopCoat() {
        return stopCoat;
    }

    public void setStopCoat(Float stopCoat) {
        this.stopCoat = stopCoat;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
