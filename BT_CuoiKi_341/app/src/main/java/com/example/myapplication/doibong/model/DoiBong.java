package com.example.myapplication.doibong.model;


public class DoiBong {
    String name , stadium , trainer , illustration ,imgmotachitiet,motachitiet;
    public DoiBong(String name, String stadium, String trainer, String illustration) {
        this.name = name;
        this.stadium = stadium;
        this.trainer = trainer;
        this.illustration = illustration;
    }

    public DoiBong(String name, String stadium, String trainer, String illustration, String imgmotachitiet, String motachitiet) {
        this.name = name;
        this.stadium = stadium;
        this.trainer = trainer;
        this.illustration = illustration;
        this.imgmotachitiet = imgmotachitiet;
        this.motachitiet = motachitiet;
    }

    public DoiBong(String name, String stadium, String illustration) {
        this.name = name;
        this.stadium = stadium;
        this.illustration = illustration;
    }

    public String getImgmotachitiet() {
        return imgmotachitiet;
    }

    public void setImgmotachitiet(String imgmotachitiet) {
        this.imgmotachitiet = imgmotachitiet;
    }

    public String getMotachitiet() {
        return motachitiet;
    }

    public void setMotachitiet(String motachitiet) {
        this.motachitiet = motachitiet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public DoiBong() {
    }
}
