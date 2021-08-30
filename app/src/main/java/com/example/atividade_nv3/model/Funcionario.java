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

    public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

        this.salarioBruto = setSalarioBruto(valorHora, horasTrabalhadas);
        this.inss = setInss(this.salarioBruto);
        this.fgts = setFgts(this.salarioBruto);
        this.ir = setIr(this.salarioBruto);
        this.salarioLiquido = getSalarioBruto() - (getInss() + getIr());

    }

    public String getNome() {
        return nome;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public double setSalarioBruto(double vhoras, double htrabalhadas) {
        return vhoras * htrabalhadas;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getFgts() {
        return fgts;
    }

    public double setFgts(double salario) {
        return salario * 0.08;
    }

    public double getIr() {
        return ir;
    }

    public double setIr(double salario) {
        if(salario > 2743.25) {
            return salario * 0.275;
        }
        else if(salario >= 1372.82 && salario <= 2743.25){
            return salario * 0.15;
        }
        else if(salario <= 1372.81) {return 0;}
        return 0;
    }

    public double getInss() {
        return inss;
    }

    public double setInss(double salario){
        if(salario <= 868.29){
            return salario * 0.08;
        }
        else if (salario >= 868.30 && salario <= 2894.28) {
            return salario * 0.09;
        }
        else if (salario > 2894.29) {
            return 318.37;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
