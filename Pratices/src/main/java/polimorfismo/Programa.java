package polimorfismo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Funcionario atendente = new Funcionario();
        atendente.setNome("Maria da Silva");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Cargo ATENDENTE/VENDEDOR:");

        String cargo = sc.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Cargo: " + cargo);

        atendente.setSalario(1200.00);
        atendente.setCargo(Cargo.valueOf(cargo));

        Venda novaVenda = new Venda(atendente, 200.0);


        System.out.println("valor da comissão: " + novaVenda.calculaComissao());
    }}


