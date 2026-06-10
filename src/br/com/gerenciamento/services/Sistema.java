package br.com.gerenciamento.services;

import br.com.gerenciamento.domain.Funcionario;
import br.com.gerenciamento.domain.Programador;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void iniciar() throws InterruptedException {
        System.out.println("----------------------");
        System.out.println(" Gerenciador Da Empresa  ");
        System.out.println("----------------------");
        String escolha;
        do {


            System.out.println("[1] Cadastrar Funcionario");
            System.out.println("[2] Listar todos os funcionários");
            System.out.println("[3] Listar Programadores ");
            System.out.println("[4] Listar QAs");
            System.out.println("[5] Listar Gerentes");
            System.out.println("[6] Listar Designers");
            System.out.println("[7] Buscar funcionário por id");
            System.out.println("[8] Remover funcionário por id");
            System.out.println("[0] Sair");
            escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("1")){
                System.out.println("[1] Programador");
                System.out.println("[2] Gerente");
                System.out.println("[3] QA");
                System.out.println("[4] Designer");
                String cargo = scanner.nextLine();
                if (cargo.equalsIgnoreCase("1")){
                    Programador programador = new Programador();

                    programador.CadastrarFunc();

                    funcionarios.add(programador);
                    System.out.println();
                    System.out.println("Funcionario adicionado!");
                }
            }else if(escolha.equalsIgnoreCase("2")){
                    listarTodosFuncionarios();
            }else if(escolha.equalsIgnoreCase("3")){
                listarProgramadores();
            }else if(escolha.equalsIgnoreCase("4")){

            }else if(escolha.equalsIgnoreCase("5")){

            }else if(escolha.equalsIgnoreCase("6")){

            }else if(escolha.equalsIgnoreCase("7")){

            }

        }while (!escolha.equalsIgnoreCase("0"));


    }

    public void listarTodosFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            System.out.println("-=-=-=-=-=-=-=");
            System.out.println("Nome: "+funcionario.getNome());
            System.out.println("CPF: "+funcionario.getCpf());
            System.out.println("Salario: "+funcionario.getSalario());
            System.out.println("ID: "+funcionario.getId());
            System.out.println("-=-=-=-=-=-=-=");
        }
    }


    public void listarProgramadores(){
        for (Funcionario funcionario : funcionarios){
            if(funcionario instanceof Programador){
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: "+funcionario.getNome());
                System.out.println("CPF: "+funcionario.getCpf());
                System.out.println("Salario: "+funcionario.getSalario());
                System.out.println("Linguagem: "+((Programador) funcionario).getLinguagem());
                System.out.println("ID: "+funcionario.getId());
                System.out.println("-=-=-=-=-=-=-=");
            }
        }
    }
}
