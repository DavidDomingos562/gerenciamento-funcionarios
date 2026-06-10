package br.com.gerenciamento.domain;

public class Carregamento {

    public void loading() throws InterruptedException {
        for (int i = 0; i < 12; i++){
            Thread.sleep(500);
            System.out.println("◼");
        }

    }
}
