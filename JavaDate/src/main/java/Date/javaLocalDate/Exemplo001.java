package Date.javaLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Exemplo001 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje.getDayOfWeek());

        System.out.println(hoje);
        System.out.println(ontem);

        var teste = Calendar.getInstance();

        System.out.println(teste);
    }
}
