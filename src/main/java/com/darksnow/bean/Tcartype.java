package com.darksnow.bean;

public class Tcartype {
    private  Integer    id;
    private  String   carTypeName;

    public Tcartype(Integer id, String carTypeName) {
        this.id = id;
        this.carTypeName = carTypeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    @Override
    public String toString() {
        return "Tcartype{" +
                "id=" + id +
                ", carTypeName='" + carTypeName + '\'' +
                '}';
    }
}
