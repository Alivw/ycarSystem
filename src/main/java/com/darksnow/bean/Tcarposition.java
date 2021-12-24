package com.darksnow.bean;


import java.util.Date;

public class Tcarposition {
  private  Integer pid;
  private  Integer areaId;
  private  String  positionNo;
  private  Date addTime;
  private  Integer  isactive;

  private String areaName;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(String positionNo) {
        this.positionNo = positionNo;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Tcarposition{" +
                "pid=" + pid +
                ", areaId=" + areaId +
                ", positionNo='" + positionNo + '\'' +
                ", addTime=" + addTime +
                ", isactive=" + isactive +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
