package map;

import java.io.IOException;
import java.util.regex.Pattern;


public class teste {


    public static void main(String[] args) throws IOException {


        String senha = "Aass9";


        System.out.println(validaSenha(senha));
    }

    private static boolean verificaMaiusculaMinusculaNumero(String senha) {

       boolean isValid = false;

        Pattern maiuscula = Pattern.compile("[A-Z]");
        Pattern minuscula = Pattern.compile("[a-z]");
        Pattern numeros = Pattern.compile("[0-9]");

        if (maiuscula.matcher(senha).find() &&
        minuscula.matcher(senha).find() && numeros.matcher(senha).find()) {
            isValid = true;

        }

        return isValid;

    }

    private static boolean verificaCaractere(String senha) {
        boolean temCaractere = false;

        Pattern caractere = Pattern.compile("[é., ^~´]");

        if (caractere.matcher(senha).find() || senha.isBlank()) {
            temCaractere = true;

        }
        return temCaractere;

    }

    private static String validaSenha(String senha) {
        String mensagem = "";

        if (senha.length() < 6 || senha.length() > 32) {
            mensagem = "Senha inválida";
        } else if (!verificaCaractere(senha) && verificaMaiusculaMinusculaNumero(senha)) {
            mensagem = "Senha válida";
        }

        else {
            mensagem = "Senha inválida";
        }

        return mensagem;

    }
}