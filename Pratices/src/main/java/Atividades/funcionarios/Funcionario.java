package Atividades.funcionarios;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {

    @Getter
    @Setter
    public String name;

    @Getter
    @Setter

    public Integer hours;

    @Getter
    @Setter
    public Double valorPorHora;

    public Funcionario(String name, Integer hours, Double valorPorHora) {
        this.name = name;
        this.hours = hours;
        this.valorPorHora = valorPorHora;
    }


    public double payment() {
        return hours * valorPorHora;

    }


}
