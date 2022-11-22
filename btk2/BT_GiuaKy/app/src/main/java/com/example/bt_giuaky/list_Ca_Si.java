package com.example.bt_giuaky;

public class list_Ca_Si {
    private String ten;
    private String ngheDanh;
    private int hinh;
    private String quocGia;
    private String saoBinhChon;
    private String moTaChiTiet;
    private int anhChiTiet;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getSaoBinhChon() {
        return saoBinhChon;
    }

    public void setSaoBinhChon(String saoBinhChon) {
        this.saoBinhChon = saoBinhChon;
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

    public list_Ca_Si(String ten, String ngheDanh, int hinh, String quocGia, String saoBinhChon, String moTaChiTiet, int anhChiTiet) {
        this.ten = ten;
        this.ngheDanh = ngheDanh;
        this.hinh = hinh;
        this.quocGia = quocGia;
        this.saoBinhChon = saoBinhChon;
        this.moTaChiTiet = moTaChiTiet;
        this.anhChiTiet = anhChiTiet;
    }

    public list_Ca_Si() {
    }

    @Override
    public String toString() {
        return "list_Ca_Si{" +
                "ten='" + ten + '\'' +
                ", ngheDanh='" + ngheDanh + '\'' +
                ", hinh=" + hinh +
                ", quocGia='" + quocGia + '\'' +
                ", saoBinhChon='" + saoBinhChon + '\'' +
                ", moTaChiTiet='" + moTaChiTiet + '\'' +
                ", anhChiTiet=" + anhChiTiet +
                '}';
    }
}
