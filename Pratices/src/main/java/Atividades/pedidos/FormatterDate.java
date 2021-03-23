package Atividades.pedidos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class FormatterDate {
    public static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formatar(LocalDate birthDate) {
        return birthDate.format(formatter);
    }

}
