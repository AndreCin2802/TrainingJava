package Atividades.pedidos.entities;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Getter
    @Setter
    public String name;
    @Getter
    @Setter
    public double price;


    public Product(String name, double price) {

        this.name = name;
        this.price = price;

    }

}
