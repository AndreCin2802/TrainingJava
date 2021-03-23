package Atividades.contratos;

import java.time.LocalDate;

public class Installment {
    private final LocalDate dueDate;
    private final Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }
}
