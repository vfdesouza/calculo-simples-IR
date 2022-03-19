package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double tax() {
        if (numberOfEmployees < 10) {
            return getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }
    }
}
