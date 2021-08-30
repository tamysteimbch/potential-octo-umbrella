package com.example.atividade_nv3.model;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public void salvar(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }

    public List<Funcionario> getListaFuncionario(){
        return listaFuncionario;
    }

    public void excluir(int p){
        listaFuncionario.remove(p);
    }

    public Funcionario getFuncionario(int p){
        return listaFuncionario.get(p);
    }

}
