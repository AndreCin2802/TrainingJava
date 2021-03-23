package Atividades.funcionarios;

public class FuncionarioExterno extends Funcionario {

    private double additionalCharge;

    public FuncionarioExterno(String name, Integer hours, Double valorPorHora, Double additionalCharge) {
        super(name, hours, valorPorHora);
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
