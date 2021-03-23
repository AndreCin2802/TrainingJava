import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method2();
        System.out.println("End of program");



    }

    public static void method2() {
        System.out.println("METHOD 2 START");
        Scanner sc = new Scanner((System.in));


        try {
            String[] vect = sc.nextLine().split(" ");

            int postion = sc.nextInt();

            System.out.println(vect[postion]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }

        catch (InputMismatchException e) {
            System.out.println("Input Error");
        }

        sc.close();
        System.out.println("METHOD 2 END");
    }
}
