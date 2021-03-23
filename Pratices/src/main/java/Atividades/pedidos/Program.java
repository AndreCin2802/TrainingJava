package Atividades.pedidos;

import Atividades.pedidos.entities.Client;
import Atividades.pedidos.entities.Order;
import Atividades.pedidos.entities.OrderItem;
import Atividades.pedidos.entities.Product;
import Atividades.pedidos.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), FormatterDate.formatter);

        Client cliente = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(cliente, LocalDate.now(), status);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();

    }


}
