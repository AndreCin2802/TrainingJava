package Atividades.contribuintes;

public class Program {
    public static void main(String[] args) {
        TaxPlayer payerOne = new Individual("Alex", 50000.00, 2000.00);
        TaxPlayer payerTwo = new Company("SoftTech", 400000.00, 25);
        TaxPlayer payerThree = new Individual("Bob", 120000.00, 1000.00);

        System.out.println(payerOne);
        System.out.println(payerTwo);
        System.out.println(payerThree);

        System.out.println("TOTAL TAXES: $ "+ String.format("%.2f",
                payerOne.tax() + payerTwo.tax() + payerThree.tax()));

    }


}
