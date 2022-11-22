package com.google.baikiemtra2;

public class MainModel {
    String tenthuonggoi , tenkhoahoc, mauca, hinhanh;


    public MainModel(String tenthuonggoi, String tenkhoahoc, String mauca, String hinhanh) {
        this.tenthuonggoi = tenthuonggoi;
        this.tenkhoahoc = tenkhoahoc;
        this.mauca = mauca;
        this.hinhanh = hinhanh;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public void setTenthuonggoi(String tenthuonggoi) {
        this.tenthuonggoi = tenthuonggoi;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void setTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getMauca() {
        return mauca;
    }

    public void setMauca(String mauca) {
        this.mauca = mauca;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public MainModel() {
    }
}
