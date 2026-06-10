package br.com.gerenciamento.domain;

import java.util.Random;

public class GeradorId {
    private static final String caractere = "0123456789";
    Random random = new Random();

    public String GerarId(){
        StringBuilder idCreate = new StringBuilder();

        for (int i = 0; i < 7; i++){
            int indice = random.nextInt(caractere.length());
            idCreate.append(caractere.charAt(indice));

        }
        return idCreate.toString();

    }
}
