package Atividades.pedidos.entities;

import Atividades.pedidos.FormatterDate;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;


public class Client {
    @Getter
    private final String name;
    @Getter
    @Setter
    private String email;
    @Getter
    private final LocalDate birhDate;

    public Client(String name, String email, LocalDate birhDate) {
        this.name = name;
        this.email = email;
        this.birhDate = birhDate;
    }



    @Override
    public String toString() {
        return name + " (" + FormatterDate.formatar(birhDate) + ")"   + " - " + email ;
    }
}
