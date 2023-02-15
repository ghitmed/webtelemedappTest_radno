package com.webtelemedapp.webtelemedapp;

import jakarta.persistence.*;

@Entity
public class ReportTm {

        @Id
        @GeneratedValue
        private Long Id;
        private String date;
        private int systolic;
        private int diastolic;
        private int heartBeats;
        private String description;

        //dodatno kod kreiranja logiranja
        @ManyToOne
        @JoinColumn
        private UserTm userTm;

    public ReportTm() {
    }

    public UserTm getUser() {
        return userTm;
    }

    public void setUser(UserTm userTm) {
        this.userTm = userTm;
    }

    public ReportTm(String date, int systolic, int diastolic, int heartBeats, String description) {
        this.date = date;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.heartBeats = heartBeats;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public int getHeartBeats() {
        return heartBeats;
    }

    public void setHeartBeats(int heartBeats) {
        this.heartBeats = heartBeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
