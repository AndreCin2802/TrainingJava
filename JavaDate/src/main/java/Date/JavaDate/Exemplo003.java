package Date.JavaDate;

import java.math.BigInteger;
import java.util.Date;
public class Exemplo003 {


    public static void main(String[] args) {




        Date dataNoPassado = new Date(1513124807691L);

        Date dataHoje = new Date();

        Date dataToken = new  Date();


        boolean isAfter = dataNoPassado.after(dataHoje);

        System.out.println(isAfter);


        boolean isBefore = dataNoPassado.before(dataHoje);

        System.out.println(isBefore);

        System.out.println(dataNoPassado);

        System.out.println(dataHoje);
    }
}
