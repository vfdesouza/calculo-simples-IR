package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        double tax, anualIncome;
        char typePerson;
        String name;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) +" data:");
            System.out.print("Individual or company (i/c)? ");
            typePerson = sc.next().charAt(0);
            while (typePerson != 'i' && typePerson != 'c') {
                System.out.print("Invalid option. Please try again: ");
                typePerson = sc.next().charAt(0);
            }
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Anual income: ");
            anualIncome = sc.nextDouble();

            if (typePerson == 'i') {
                System.out.print("Health Expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add( new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        for (TaxPayer tp : list) {
            tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
        }
    }
}

