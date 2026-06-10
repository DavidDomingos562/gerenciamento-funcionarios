package br.com.gerenciamento.domain;

public class Gerente extends Funcionario{
    private String setor;

    @Override
    public void CadastrarFunc() throws InterruptedException {
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.println("CPF: ");
        setCpf(scanner.nextLine());
        System.out.println("Setor: ");
        this.setor = scanner.nextLine();
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
