package com.webtelemedapp.webtelemedapp;

public class User {
    //dodano za logiranje
    static int idCounter = 0;
    int id;
    //0-Patient, 1-Admin
    int type = 0;

    public User(String email, String lozinka) {
        this.email = email;
        this.lozinka = lozinka;

        id = idCounter++;
    }


    private String ime;
    private String prezime;
    private String datumRodenja;
    private String brojMobitela;
    private String email;
    private String lozinka;
    private String mbo;

    public User(String ime, String prezime, String datumRodenja, String brojMobitela, String email, String lozinka, String mbo) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodenja = datumRodenja;
        this.brojMobitela = brojMobitela;
        this.email = email;
        this.lozinka = lozinka;
        this.mbo = mbo;
        id = idCounter++;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(String datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public String getBrojMobitela() {
        return brojMobitela;
    }

    public void setBrojMobitela(String brojMobitela) {
        this.brojMobitela = brojMobitela;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getMbo() {
        return mbo;
    }

    public void setMbo(String mbo) {
        this.mbo = mbo;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
