package com.example.hismemberservice.bo;

public class PackageBO {

    private String packageName;

    private Integer price;

    private String bizId;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    @Override
    public String toString() {
        return "PackageBO{" +
                "packageName='" + packageName + '\'' +
                ", price=" + price +
                ", bizId='" + bizId + '\'' +
                '}';
    }
}
