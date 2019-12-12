package com.company;

public class Situation {
    Situation[] direction;
    String subject, text;
    int dH, dE, dA;
    public Situation (String subject, String text, int var, int dh, int de, int da){
        this.subject = subject;
        this.text = text;
        dH=dh;
        dE=de;
        dA=da;
        direction = new Situation[var];
    }
}
