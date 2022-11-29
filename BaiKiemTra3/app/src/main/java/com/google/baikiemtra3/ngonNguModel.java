package com.google.baikiemtra3;

public class ngonNguModel {
    private String Ten ;
    private int Hinh ;

    public ngonNguModel(String ten, int hinh) {
        Ten = ten;
        Hinh = hinh;
    }

    public ngonNguModel() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
