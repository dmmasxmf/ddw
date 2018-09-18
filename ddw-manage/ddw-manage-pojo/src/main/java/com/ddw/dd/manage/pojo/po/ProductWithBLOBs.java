package com.ddw.dd.manage.pojo.po;

public class ProductWithBLOBs extends Product {
    private String images;

    private String detail;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}