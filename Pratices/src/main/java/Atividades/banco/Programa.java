package Atividades.banco;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account Holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        Titular titular = new Titular(accountNumber,accountHolder);
        Banco conta = new Banco(titular);

        System.out.print("Is there a initial deposit value (y/n)?");
        char option = sc.next().charAt(0);

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            conta.deposit(sc.nextDouble());
            System.out.println(conta);
        }

        System.out.print("Enter a deposit value: ");
        conta.deposit(sc.nextDouble());
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        conta.widthdraw(sc.nextDouble());
        System.out.println(conta);

    }
}
