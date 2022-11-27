package com.example.myapplication.doibong.model;

public class DoiBong1 {
    private String moTaChiTiet;
    private String sanVanDong;
    private String doiBongXuHuong;
    private String tenDoiBong;
    private int img;
    private String moTa;

    public DoiBong1(String doiBongXuHuong, String tenDoiBong, int img, String moTa) {
        this.tenDoiBong = tenDoiBong;
        this.img = img;
        this.moTa = moTa;
        this.doiBongXuHuong=doiBongXuHuong;
    }


    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public DoiBong1(String sanVanDong, String moTaChiTiet, String tenDoiBong, int img, String moTa) {
        this.sanVanDong = sanVanDong;
        this.moTaChiTiet = moTaChiTiet;
        this.tenDoiBong = tenDoiBong;
        this.img = img;
        this.moTa = moTa;
    }

    public DoiBong1(int img) {
        this.img = img;
    }

    public String getSanVanDong() {
        return sanVanDong;
    }

    public void setSanVanDong(String sanVanDong) {
        this.sanVanDong = sanVanDong;
    }

    public DoiBong1(String tenDoiBong, int img, String moTa) {
        this.tenDoiBong = tenDoiBong;
        this.img = img;
        this.moTa = moTa;
    }

    public DoiBong1() {
    }

    public String getDoiBongXuHuong() {
        return doiBongXuHuong;
    }

    public void setDoiBongXuHuong(String doiBongXuHuong) {
        this.doiBongXuHuong = doiBongXuHuong;
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public void setTenDoiBong(String tenDoiBong) {
        this.tenDoiBong = tenDoiBong;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
