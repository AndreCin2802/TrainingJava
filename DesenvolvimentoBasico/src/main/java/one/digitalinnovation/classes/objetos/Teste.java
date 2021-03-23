package one.digitalinnovation.classes.objetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Teste {
    public static void main(String[] args) {

        int[] result = new int[2];

        List<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<Integer>();

        b.add(4);
        b.add(5);
        b.add(6);



        for(int i = 0; i < a.size(); i++) {

            if(a.get(i) > b.get(i)) {
                //alice

                result[0]+= 1;
            }

            else if(b.get(i) > a.get(i)) {
                result[1]+= 1;
            }

            else {
                //neither
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
