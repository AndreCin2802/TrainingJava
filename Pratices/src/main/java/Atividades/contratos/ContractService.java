package Atividades.contratos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContractService {
    private final PaymentService paymentService;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public double calculeInstallment(double valorTotal, int number, int month) {
        double installment = valorTotal / number;
        installment = installment + installment * (0.01 * (month + 1));
        return installment + (installment * 0.02);
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++) {
            double updateQuota = basicQuota + paymentService.interest(basicQuota, i);
            double fullQuota = updateQuota + paymentService.paymentFee(updateQuota);
            LocalDate dueDate = contract.getDate().plusMonths(i);
            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    public void printInstallments(Contract contract) {

        contract.getInstallments().forEach(installment -> {
            System.out.println(""+ dtf.format(installment.getDueDate()) + " - "  + String.format(
                    "%.2f", installment.getAmount()));
        });

    }
}
