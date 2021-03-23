package Atividades.contribuintes;

public class Company extends  TaxPlayer{

    private int numberOfEmployeees;


    public Company(String name, double anualInCome, int numberOfEmployeees) {
        super(name, anualInCome);
        this.numberOfEmployeees = numberOfEmployeees;
    }

    public int getNumberOfEmployeees() {
        return numberOfEmployeees;
    }

    public void setNumberOfEmployeees(int numberOfEmployeees) {
        this.numberOfEmployeees = numberOfEmployeees;
    }

    @Override
    public double tax() {
        double taxaAnual = getAnualInCome();

        if(numberOfEmployeees > 10) {
            taxaAnual = taxaAnual * 0.14;
        }

        else {
            taxaAnual = taxaAnual * .16;
        }



        return taxaAnual;
    }




}
