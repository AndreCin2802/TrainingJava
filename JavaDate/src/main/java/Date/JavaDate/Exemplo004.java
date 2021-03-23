package Date.JavaDate;
import java.util.Calendar;
import java.util.Date;
public class Exemplo004 {
    public static void main(String[] args) {
        Date meuDia = new Date(100, Calendar.FEBRUARY, 28);

        var meuDiaEmMills = meuDia.getTime();

        Date meuDiaMs = new Date(meuDiaEmMills);

        Date pastDate = new Date(110, Calendar.MAY, 15);


        String compareDate = meuDiaMs.before(pastDate) ? "Dia anterior" : "Dia posterior";

        System.out.println(pastDate);
        System.out.println(compareDate);


    }


}
