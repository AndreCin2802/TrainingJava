package Atividades.pedidos.entities;

import lombok.Getter;
import lombok.Setter;

public class OrderItem {
    @Getter
    @Setter
    private Integer quantity;
    @Getter
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;

        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", product.getPrice()) + "," +
                " " +
                "Quantity: " +
                quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}
