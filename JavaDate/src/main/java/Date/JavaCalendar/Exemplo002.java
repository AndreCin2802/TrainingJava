package Date.JavaCalendar;

import java.time.Duration;
import java.util.Arrays;
import java.util.Calendar;

public class Exemplo002 {

    public Calendar dataVencimento;

    public Exemplo002(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    void CalcularDiasParaPagar(Calendar dataVencimento) {

        var dataAtual = Calendar.getInstance().getTime();

        var DayOfWeek = dataVencimento.get(Calendar.DAY_OF_WEEK);

        if(DayOfWeek == 7) {
            dataVencimento.add(Calendar.DATE, 2);
        }

        if(DayOfWeek == 1) {
            dataVencimento.add(Calendar.DATE, 1);
        }

        int diasRestantes = (int) Duration.between(dataAtual.toInstant(), dataVencimento.toInstant()).toDays();

        System.out.println(dataVencimento.getTime());

        System.out.println(diasRestantes);

    }


    public static void main(String[] args) {

        var cliente = new Exemplo002(Calendar.getInstance());

        cliente.dataVencimento.set(2021, Calendar.MARCH,14, 23, 59);

        cliente.CalcularDiasParaPagar(cliente.dataVencimento);


    }

}
