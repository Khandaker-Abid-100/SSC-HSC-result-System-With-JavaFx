package org.example.resultsystem.model;

public class Versity {
    private String year;
    private double totalgpa;

    public Versity(String year, double totalgpa) {
        this.year = year;
        this.totalgpa = totalgpa;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getTotalgpa() {
        return totalgpa;
    }

    public void setTotalgpa(double totalgpa) {
        this.totalgpa = totalgpa;
    }
}
