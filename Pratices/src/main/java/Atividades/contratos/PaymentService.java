package Atividades.contratos;

public interface PaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);

}
