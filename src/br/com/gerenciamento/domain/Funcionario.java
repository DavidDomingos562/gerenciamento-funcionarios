package br.com.gerenciamento.domain;

import java.util.Scanner;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String cargo;
    protected String id;
    protected Scanner scanner = new Scanner(System.in);
    protected Carregamento carregamento;
    protected GeradorId geradorId = new GeradorId();



    public abstract void CadastrarFunc() throws InterruptedException;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
