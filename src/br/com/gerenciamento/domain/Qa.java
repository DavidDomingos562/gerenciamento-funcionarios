package br.com.gerenciamento.domain;

public class Qa extends Funcionario{
    private String ferramenta;


    @Override
    public void CadastrarFunc() throws InterruptedException {
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.println("CPF: ");
        setCpf(scanner.nextLine());
        System.out.println("Ferramenta: ");
        this.ferramenta = scanner.nextLine();
        System.out.println("Salario: ");
        setSalario(scanner.nextDouble());
        System.out.print("Gerando ID ");
        for (int i = 0; i < 5; i++){
            Thread.sleep(500);
            System.out.print("◼");
        }
        String idGerado = geradorId.GerarId();
        id = idGerado;
        System.out.println();
        System.out.println("ID: "+idGerado);
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }
}
