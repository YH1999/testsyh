package com.cn.syh.entity;

import java.math.BigDecimal;

public class train_info {

    private String tain_no;
    private String start_station;
    private String arrival_station;
    private String start_time;
    private String arrival_time;
    private String type;
    private String seatnum;
    private BigDecimal mile;
    private double tmoney;

    public String getTain_no() {
        return tain_no;
    }

    public void setTain_no(String tain_no) {
        this.tain_no = tain_no;
    }

    public String getStart_station() {
        return start_station;
    }

    public void setStart_station(String start_station) {
        this.start_station = start_station;
    }

    public String getArrival_station() {
        return arrival_station;
    }

    public void setArrival_station(String arrival_station) {
        this.arrival_station = arrival_station;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(String seatnum) {
        this.seatnum = seatnum;
    }

    public BigDecimal getMile() {
        return mile;
    }

    public void setMile(BigDecimal mile) {
        this.mile = mile;
    }

    public double getTmoney() {
        return tmoney;
    }

    public void setTmoney(double tmoney) {
        this.tmoney = tmoney;
    }
}
