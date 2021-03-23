package Atividades.produtos;

public class ImportedProduct extends Product{

    private final Double customsFee;

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return  getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "Customs fee: $ " + String.format("%.2f",customsFee);
    }
}
