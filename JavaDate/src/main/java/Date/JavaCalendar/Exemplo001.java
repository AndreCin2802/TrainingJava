package Date.JavaCalendar;

import java.util.Calendar;

public class Exemplo001 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        System.out.println(now.getTime());

        now.add(Calendar.HOUR, 2);

        System.out.println(now.getTime());



    }
}
