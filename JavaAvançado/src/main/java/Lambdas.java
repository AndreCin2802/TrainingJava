public class Lambdas{


    public static void main(String[] args) {

        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;

        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));

    }
}
