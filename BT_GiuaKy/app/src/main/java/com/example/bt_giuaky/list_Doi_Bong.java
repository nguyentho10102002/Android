package com.example.bt_giuaky;

import androidx.activity.result.contract.ActivityResultContracts;

public class list_Doi_Bong {
    private String ten;
    private String moTa;
    private int hinh;
    private String tenSVD;
    private String tenHLV;
    private String moTaChiTiet;
    private int anhChiTiet;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTenSVD() {
        return tenSVD;
    }

    public void setTenSVD(String tenSVD) {
        this.tenSVD = tenSVD;
    }

    public String getTenHLV() {
        return tenHLV;
    }

    public void setTenHLV(String tenHLV) {
        this.tenHLV = tenHLV;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public int getAnhChiTiet() {
        return anhChiTiet;
    }

    public void setAnhChiTiet(int anhChiTiet) {
        this.anhChiTiet = anhChiTiet;
    }

    public list_Doi_Bong(String ten, String moTa, int hinh, String tenSVD, String tenHLV, String moTaChiTiet, int anhChiTiet) {
        this.ten = ten;
        this.moTa = moTa;
        this.hinh = hinh;
        this.tenSVD = tenSVD;
        this.tenHLV = tenHLV;
        this.moTaChiTiet = moTaChiTiet;
        this.anhChiTiet = anhChiTiet;
    }

    public list_Doi_Bong() {
    }

    @Override
    public String toString() {
        return "list_Doi_Bong{" +
                "ten='" + ten + '\'' +
                ", moTa='" + moTa + '\'' +
                ", hinh=" + hinh +
                ", tenSVD='" + tenSVD + '\'' +
                ", tenHLV='" + tenHLV + '\'' +
                ", moTaChiTiet='" + moTaChiTiet + '\'' +
                ", anhChiTiet=" + anhChiTiet +
                '}';
    }
}
