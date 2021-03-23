package Atividades.contratos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        int number = 8028;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dateContract = LocalDate.parse("25/06/2018", dtf);

        double contractValue = 600.00;

        Contract contract = new Contract(number, dateContract, contractValue);

        ContractService cs = new ContractService(new Paypal());
        int installmentNumber = 3;

        cs.processContract(contract, installmentNumber);

        cs.printInstallments(contract);
    }
}

