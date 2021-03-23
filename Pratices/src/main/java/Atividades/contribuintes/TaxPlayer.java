package Atividades.contribuintes;

public  abstract  class TaxPlayer {
    private String name;
    private double anualInCome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualInCome() {
        return anualInCome;
    }

    public void setAnualInCome(double anualInCome) {
        this.anualInCome = anualInCome;
    }

    public TaxPlayer(String name, double anualInCome) {
        this.name = name;
        this.anualInCome = anualInCome;
    }

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }

    public abstract double tax();

}

