package aula3;

public class ThreadExemplo {
    public static void main(String[] args) {

        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento2 barraDeCarregamento22 = new BarraDeCarregamento2();
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();

        barraDeCarregamento.start();
        barraDeCarregamento2.start();
        barraDeCarregamento22.start();
        for(int i =0; i < 5; i++) {
            System.out.println(i);

            System.out.println(barraDeCarregamento.isAlive());
        }

    }
}

class GerarPDF implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerar PDF");

    }
}

class BarraDeCarregamento extends Thread {
    @Override
    public void run() {
        System.out.println("Loading...");

    }
}

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Rodei: " + this.getName());

    }
}

