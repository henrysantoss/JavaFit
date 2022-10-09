package com.whaise.javafit.Get;

public class GetPlanos {
    private String id,nome,aluno,modalidade,valor;
    
    public GetPlanos(String id,String nome,String aluno,String modalidade,String valor){
        this.id = id;
        this.nome = nome;
        this.aluno = aluno;
        this.modalidade = modalidade;
        this.valor = valor;
    }
    
    public String GetId(){
        return id;
    }
    public String GetNome(){
        return nome;
    }
    public String GetAluno(){
        return aluno;
    }
    public String GetModalidade(){
        return modalidade;
    }
    public String GetValor(){
        return valor;
    }
}
