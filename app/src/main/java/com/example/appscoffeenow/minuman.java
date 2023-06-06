package com.example.appscoffeenow;

public class minuman {
    private String nama,descripsi;
    private Integer price, image;

    public minuman(String nama, String descripsi, Integer price, Integer image) {
        this.nama = nama;
        this.descripsi = descripsi;
        this.price = price;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescripsi() {
        return descripsi;
    }

    public void setDescripsi(String descripsi) {
        this.descripsi = descripsi;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
