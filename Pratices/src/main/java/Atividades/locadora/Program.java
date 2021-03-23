package Atividades.locadora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime start = LocalDateTime.parse("20/08/2018 10:30", dtf);
        LocalDateTime finish = LocalDateTime.parse("22/08/2018 11:40", dtf);

        String carModel = "Civic";

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        double pricePerHour = 10.00;
        double pricePerDay = 130.00;

        RentalService rentalService =
                new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInVoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

    }
}
