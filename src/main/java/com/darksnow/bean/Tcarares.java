package com.darksnow.bean;

public class Tcarares {
  private  Integer  id;
  private  String  areaName;
  private  float  price;

    public Tcarares() {
        this.id = id;
        this.areaName = areaName;
        this.price =  price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tcarares{" +
                "id=" + id +
                ", areaName='" + areaName + '\'' +
                ", price=" + price +
                '}';
    }
}
