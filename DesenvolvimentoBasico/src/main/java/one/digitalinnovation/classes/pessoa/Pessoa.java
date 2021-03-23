package one.digitalinnovation.classes.pessoa;
public class Pessoa {
    private Integer idade;
    private Float peso;

    public  Pessoa() {

    }

    public  Pessoa(final Integer idade) {this.idade = idade;}

    public  Pessoa(final Integer idade, final Float peso){
        this.idade = idade;
        this.peso = peso;

    }


    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    protected  String relatorio() { return "Idade: " + idade + " e Peso: " + peso;}
}
