package com.example.auto.model;


import javax.persistence.*;

@Entity
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String nrplaat;

    private String merk;

    private  String kleur;
    private int aantalDeuren;

    public Auto(){

    }


    public Auto(String nrplaat, String merk, String kleur,int aantalDeuren){
        setNrplaat(nrplaat);
        setMerk(merk);
        setKleur(kleur);
        setAantalDeuren(aantalDeuren);

    }
    public  int getId(){return id;}
    public void setId(int id) {this.id = id;}

    public String getNrplaat(){return  nrplaat;}

    public void setNrplaat(String nrplaat) {
        this.nrplaat = nrplaat;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
