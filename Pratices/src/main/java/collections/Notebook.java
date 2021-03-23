package collections;

public class Notebook {
    private final String nome;
    private final String marca;
    private final Teclado teclado;
    public Tela tela;
    private boolean ligado;



    public Notebook(String nome, String marca, Teclado teclado, Tela tela) {
        this.nome = nome;
        this.marca = marca;
        this.teclado = teclado;
        this.tela = tela;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Tela getTela() {
        return tela;
    }

    @Override
    public String toString() {
        return "Notebook{" + "nome='" + nome + '\'' + ", marca='" + marca + '\'' + '}';
    }
}
