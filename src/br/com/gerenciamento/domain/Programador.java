package br.com.gerenciamento.domain;

public class Programador extends Funcionario implements Info{
    private String linguagem;

    @Override
    public void CadastrarFunc() throws InterruptedException {
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.println("CPF: ");
        setCpf(scanner.nextLine());
        System.out.println("Linguagem: ");
        this.linguagem = scanner.nextLine();
        System.out.println("Salario: ");
        setSalario(scanner.nextDouble());
        System.out.print("Gerando ID ");
        for (int i = 0; i < 5; i++){
            Thread.sleep(500);
            System.out.print("◼");
        }
        String idGerado = geradorId.GerarId();
        System.out.println();
        System.out.println("ID: "+idGerado);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: "+nome);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
