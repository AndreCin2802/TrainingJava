package polimorfismo;

public class Venda {
    private final Funcionario funcionario;
    private final double valor;

    public Venda(Funcionario funcionario, double valor) {
        this.funcionario = funcionario;
        this.valor = valor;
    }

    public double calculaComissao() {
        double comissao = 0.0;

        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.calculaComissao(valor);

        return comissao;
    }
    }

