package entities;

import java.util.Scanner;

public abstract class TaxPayer {

    Scanner sc = new Scanner(System.in);

    private String name;
    private double anualIncome;
    double taxesPaid = 0;


    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Double tax();
}
