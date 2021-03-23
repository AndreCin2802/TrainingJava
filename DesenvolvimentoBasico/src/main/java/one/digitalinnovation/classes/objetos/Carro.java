package one.digitalinnovation.classes.objetos;

public class Carro {

    private int pessoas;

    public Carro(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void adicionarPessoas(int n) {
        this.pessoas = pessoas + n;

    }

    public  void removerPessoas(int n) {

        if(pessoas <= 0) {
            System.out.println("Não há mais pessoas no carro.");
            this.pessoas = 0;
        }

        else {
            this.pessoas = pessoas - n;
        }



    }

    public static void main(String[] args) {
         Carro bmw = new Carro(4);

        System.out.println(bmw.getPessoas());

        bmw.adicionarPessoas(1);

        System.out.println(bmw.getPessoas());


        bmw.removerPessoas(5);

        System.out.println(bmw.getPessoas());

        bmw.removerPessoas(5);


        bmw.removerPessoas(2);

        System.out.println(bmw.getPessoas());


    }
}
