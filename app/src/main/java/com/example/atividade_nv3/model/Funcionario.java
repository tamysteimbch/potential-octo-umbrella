package com.example.atividade_nv3.model;

public class Funcionario {

    private String nome;
    private double horasTrabalhadas;
    private double valorHora;
    private double salarioBruto;
    private double salarioLiquido;
    private double inss;
    private double fgts;
    private double ir;

    public Funcionario() {
    }

    public Funcionario(String nome, int horasTrabalhadas, double valorHora, double salarioBruto,
                       double salarioLiquido, double inss, double fgts, double ir) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.inss = inss;
        this.fgts = fgts;
        this.ir = ir;
    }

    public Funcionario(String toString, double parseDouble, double parseDouble1) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() { return valorHora; }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }

    public double getIr() {

        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss){

        this.inss = inss;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
