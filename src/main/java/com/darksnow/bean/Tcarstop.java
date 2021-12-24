package com.darksnow.bean;

import java.util.Date;

public class Tcarstop {
    private  Integer   cid;
    private  String    carNumber;
    private Integer carTypeId;
    private String carTypeName;
    private  String    carPositionNo;
    private  Date      startTime;
    private  Date      endTime;
    private  float    stopDuration;
    private  float    stopCoat;
    private  float    price;

    public Tcarstop(Integer cid, String carNumber, Integer carTypeId, String carPositionNo, Date startTime, Date endTime, float stopDuration, float stopCoat, float price) {
        this.cid = cid;
        this.carNumber = carNumber;
        this.carTypeId = carTypeId;
        this.carPositionNo = carPositionNo;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stopDuration = stopDuration;
        this.stopCoat = stopCoat;
        this.price = price;
    }

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

    public double getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(float stopDuration) {
        this.stopDuration = stopDuration;
    }

    public double getStopCoat() {
        return stopCoat;
    }

    public void setStopCoat(float stopCoat) {
        this.stopCoat = stopCoat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    @Override
    public String toString() {
        return "Tcarstop{" +
                "cid=" + cid +
                ", carNumber='" + carNumber + '\'' +
                ", carTypeId=" + carTypeId +
                ", carPositionNo='" + carPositionNo + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", stopDuration=" + stopDuration +
                ", stopCoat=" + stopCoat +
                ", price=" + price +
                '}';
    }
}
