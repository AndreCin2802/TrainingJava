package Date.JavaDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {
        Date longDate = new Date();

        Long currentTimeMills = System.currentTimeMillis();

        System.out.println(currentTimeMills);

        Date novaData = new Date(currentTimeMills);

        System.out.println(novaData);

    }
}
