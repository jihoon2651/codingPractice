package com.edu.twond;

public class Stock {

    int porkFeet;
    int onion;
    int greenOnion;
    int garlic;
    int pepper;

    public Stock() {
    }

    public Stock(int porkFeet, int onion, int greenOnion, int garlic, int pepper) {
        this.porkFeet = porkFeet;
        this.onion = onion;
        this.greenOnion = greenOnion;
        this.garlic = garlic;
        this.pepper = pepper;
    }

    public int getPorkFeet() {
        return porkFeet;
    }

    public void setPorkFeet(int porkFeet) {
        this.porkFeet = porkFeet;
    }

    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public int getGreenOnion() {
        return greenOnion;
    }

    public void setGreenOnion(int greenOnion) {
        this.greenOnion = greenOnion;
    }

    public int getGarlic() {
        return garlic;
    }

    public void setGarlic(int garlic) {
        this.garlic = garlic;
    }

    public int getPepper() {
        return pepper;
    }

    public void setPepper(int pepper) {
        this.pepper = pepper;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "porkFeet=" + porkFeet +
                ", onion=" + onion +
                ", greenOnion=" + greenOnion +
                ", garlic=" + garlic +
                ", pepper=" + pepper +
                '}';
    }
}
