package Atividades.banco;

import lombok.Getter;
import lombok.Setter;

public class Titular {
    @Getter
    private final int account;

    @Getter
    @Setter
    private String titular;

    public Titular(int account, String titular) {
        this.account = account;
        this.titular = titular;
    }
}
