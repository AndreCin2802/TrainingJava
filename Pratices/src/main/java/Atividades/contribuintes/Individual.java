package Atividades.contribuintes;

public class Individual extends TaxPlayer{

    private double healthExpenditures;

    public Individual(String name, double anualInCome, double healthExpenditures) {
        super(name, anualInCome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double taxaAnual = getAnualInCome();

       taxaAnual = taxaAnual < 20000.00 ? (taxaAnual * 0.15) : (taxaAnual * 0.25);

       taxaAnual = taxaAnual - getHealthExpenditures() * 0.5;

        return taxaAnual;
    }

}
