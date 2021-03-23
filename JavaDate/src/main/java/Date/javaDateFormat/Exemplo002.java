package Date.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss  ");

        String dataFormatted = formatter.format(agora);

        System.out.println(dataFormatted);
    }
}
