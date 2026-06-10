package br.com.gerenciamento.services;

import br.com.gerenciamento.domain.*;

import java.lang.classfile.attribute.NestHostAttribute;
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

            if (escolha.equalsIgnoreCase("1")) {
                System.out.println("[1] Programador");
                System.out.println("[2] Gerente");
                System.out.println("[3] QA");
                System.out.println("[4] Designer");
                String cargo = scanner.nextLine();
                if (cargo.equalsIgnoreCase("1")) {
                    Programador programador = new Programador();

                    programador.CadastrarFunc();

                    funcionarios.add(programador);
                    System.out.println();
                    System.out.println("Funcionario Adicionado!");
                } else if (cargo.equalsIgnoreCase("2")) {
                    Gerente gerente = new Gerente();
                    gerente.CadastrarFunc();

                    funcionarios.add(gerente);
                    System.out.println("Funcionario Adicionado!");

                } else if (cargo.equalsIgnoreCase("3")) {
                    Qa qa = new Qa();

                    qa.CadastrarFunc();
                    funcionarios.add(qa);
                    System.out.println("Funcionario Adicionado");
                } else if (cargo.equalsIgnoreCase("4")) {
                    Design design = new Design();
                    design.CadastrarFunc();
                    funcionarios.add(design);
                    System.out.println("Funcionario Adicionado");
                }
            } else if (escolha.equalsIgnoreCase("2")) {
                listarTodosFuncionarios();
            } else if (escolha.equalsIgnoreCase("3")) {
                listarProgramadores();
            } else if (escolha.equalsIgnoreCase("4")) {
                listarQas();
            } else if (escolha.equalsIgnoreCase("5")) {
                listarGerentes();
            } else if (escolha.equalsIgnoreCase("6")) {
                listarDesignrs();
            } else if (escolha.equalsIgnoreCase("7")) {
                buscarPorId();
            } else if (escolha.equalsIgnoreCase("8")) {

            } else {
                System.out.println("Opção invalida");
            }

        } while (!escolha.equalsIgnoreCase("0"));


    }

    public void listarTodosFuncionarios() {
        boolean encontrou = false;

        for (Funcionario funcionario : funcionarios) {
            System.out.println("-=-=-=-=-=-=-=");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salario: " + funcionario.getSalario());
            System.out.println("ID: " + funcionario.getId());
            System.out.println("-=-=-=-=-=-=-=");
            encontrou = true;
        }
        if (!encontrou) {
            System.out.println("Nenhum Funcionario encontrado");
        }
    }

    public void listarGerentes() {
        boolean encontrou = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Salario: " + funcionario.getSalario());
                System.out.println("Setor: " + ((Gerente) funcionario).getSetor());
                System.out.println("ID: " + funcionario.getId());
                System.out.println("-=-=-=-=-=-=-=");
                encontrou = true;
            }
            if (!encontrou) {
                System.out.println("Nenhum gerente encontrado");
            }
        }
    }

    public void listarDesignrs() {
        boolean encontrou = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Design) {
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Salario: " + funcionario.getSalario());
                System.out.println("Linguagem: " + ((Design) funcionario).getFerramenta());
                System.out.println("ID: " + funcionario.getId());
                System.out.println("-=-=-=-=-=-=-=");
                encontrou = true;
            }
            if (!encontrou) {
                System.out.println("Nenhum Design encontrado");
            }
        }
    }

    public void listarProgramadores() {
        boolean encontrou = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Programador) {
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Salario: " + funcionario.getSalario());
                System.out.println("Linguagem: " + ((Programador) funcionario).getLinguagem());
                System.out.println("ID: " + funcionario.getId());
                System.out.println("-=-=-=-=-=-=-=");
                encontrou = true;
            }
            if (!encontrou) {
                System.out.println("Nenhum Programador encontrado");
            }
        }
    }

    public void listarQas() {
        boolean encontrou = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Qa) {
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Salario: " + funcionario.getSalario());
                System.out.println("Linguagem: " + ((Qa) funcionario).getFerramenta());
                System.out.println("ID: " + funcionario.getId());
                System.out.println("-=-=-=-=-=-=-=");
                encontrou = true;
            }
            if (!encontrou) {
                System.out.println("Nenhum QA encontrado");
            }
        }
    }

    public void buscarPorId() {
        if (funcionarios.isEmpty()) {
            System.out.println("⚠\uFE0FNenhum Funcionario Cadastrado");
            return;
        }

        System.out.println("\uD83D\uDD0DDigite o Id do funcionario");
        String idBusca = scanner.nextLine();
        boolean encontrou = false;

        for (Funcionario f : funcionarios) {
            if (f.getId() != null && f.getId().equalsIgnoreCase(idBusca)) {
                System.out.println("✅Funcionario encontrado");
                System.out.println("-=-=-=-=-=-=-=");
                System.out.println("nome: " + f.getNome());
                System.out.println("CPF: " + f.getCpf());
                System.out.println("Salario: " + f.getSalario());
                System.out.println("ID: " + f.getId());


                if (f instanceof Programador) {
                    System.out.println("Cargo: Programador");
                    System.out.println("Linguagem: " + ((Programador) f).getLinguagem());
                    System.out.println("-=-=-=-=-=-=-=");
                } else if (f instanceof Gerente) {
                    System.out.println("Cargo: Gerente");
                    System.out.println("Setor " + ((Gerente) f).getSetor());
                    System.out.println("-=-=-=-=-=-=-=");
                } else if (f instanceof Design) {
                    System.out.println("Cargo: Designer");
                    System.out.println("Ferramenta: " + ((Design) f).getFerramenta());
                    System.out.println("-=-=-=-=-=-=-=");
                } else if (f instanceof Qa) {
                    System.out.println("Cargo: QA");
                    System.out.println("Ferramenta: " + ((Qa) f).getFerramenta());
                    System.out.println("-=-=-=-=-=-=-=");
                }
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum Funcionario encontrado");
        }
    }


}
