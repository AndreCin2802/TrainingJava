package one.digitalinnovation.strings;


import java.util.Arrays;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println("A  B C D E F G".toCharArray());
        System.out.println(Arrays.toString("Aula de Java".split("")));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]" , "#" ));


    }
}
