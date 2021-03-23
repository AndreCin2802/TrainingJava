import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        List<Integer> resultado = new ArrayList<>();

        resultado.add(0,0);
        resultado.add(1,0);

        a.add(3);
        a.add(3);
        a.add(4);

        b.add(2);
        b.add(4);
        b.add(5);

        int contadorB = 1;
        int contadorA = 1;


        for(int i = 0; i < a.size(); i++) {

            System.out.println("aa" + a.get(i));
            System.out.println("bb" + b.get(i));

            if(a.get(i) > b.get(i)) {

                resultado.set(0,contadorA);
                contadorA++;
            }

            if(a.get(i) < b.get(i)) {
                System.out.println("B maior");
                resultado.set(1,contadorB);
                contadorB++;

            }

        }

        System.out.println(resultado);

    }
}
