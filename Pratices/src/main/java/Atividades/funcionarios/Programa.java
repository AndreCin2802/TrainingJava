package Atividades.funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> Funcs = new ArrayList<>();


        System.out.print("Digite o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + " data:");
            System.out.print("é Terceirzado? (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Valor por hora");
            double valorPorHora = sc.nextDouble();

            if (ch == 'y') {
                System.out.println("Taxa adicional");
                double additionalCharge = sc.nextDouble();
                Funcionario emp =
                        new FuncionarioExterno(name, hours, valorPorHora, additionalCharge);
                Funcs.add(emp);
            } else {
                Funcionario emp = new Funcionario(name, hours, valorPorHora);
                Funcs.add(emp);
            }
        }

        System.out.println();
        System.out.println("Funcionários:");

        Funcs.forEach(funcionario -> System.out.println(funcionario.getName() + " - $ " + funcionario.payment()));


        sc.close();

    }
}
