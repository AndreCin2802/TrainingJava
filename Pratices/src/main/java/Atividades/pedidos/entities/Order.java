package Atividades.pedidos.entities;

import Atividades.pedidos.FormatterDate;
import Atividades.pedidos.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Order {
    private final Client cliente;
    private final List<OrderItem> items = new ArrayList<OrderItem>();
    private final LocalDate moment;
    private final OrderStatus status;
    Formatter formatter;

    public Order(Client cliente, LocalDate moment, OrderStatus status) {
        this.cliente = cliente;
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double totalPrice = 0;

        for (OrderItem item : items) {

            totalPrice+= item.subTotal();

        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(FormatterDate.formatar(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(cliente).append("\n");
        sb.append("Order items:\n");
        items.forEach(item -> sb.append(item).append("\n"));

        sb.append("Total Price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();


    }
}
