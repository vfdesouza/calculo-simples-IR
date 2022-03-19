package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaxPayer x;
        double tax;
        char typePerson;
        String name;
        double anualIncome;

        System.out.print("Individual or company (i/c)? ");
        typePerson = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Anual income: ");
        anualIncome = sc.nextDouble();


        if (typePerson == 'i') {
            System.out.print("Health Expenditures: ");
            double healthExpenditures = sc.nextDouble();
            x = new Individual(name, anualIncome, healthExpenditures);
            tax = x.tax();
        } else {
            System.out.print("Number of employees: ");
            int numberOfEmployees = sc.nextInt();
            x = new Company(name, anualIncome, numberOfEmployees);
            tax = x.tax();
        }
            System.out.println(x.getName() + ": $" + tax);
        }

    }

