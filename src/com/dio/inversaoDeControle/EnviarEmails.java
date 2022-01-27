package com.dio.inversaoDeControle;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha){}
    public void retornar(String mensagem){
        System.out.println("email enviado");
    }
    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("stmp", "jaspion@email.com", "senha");
    }
}
