package com.example.tp2;

public class Etablissement {

    private String label;
    private String name;
    int imag;

    public Etablissement(String label, String name, int img) {
        this.label = label;
        this.name = name;
        this.imag = img;
    }

    public String getlabel() {
        return label;
    }

    public String getname() {
        return name;
    }

    public int getimage() {
        return imag;
    }
}