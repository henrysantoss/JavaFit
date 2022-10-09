package com.whaise.javafit.Get;

public class GetMatricula {
    private String id,descricao,aluno,turma,modalidade;
    
    public GetMatricula(String id,String descricao,String aluno,String turma,String modalidade) {
        this.id = id;
        this.descricao = descricao;
        this.aluno = aluno;
        this.turma = turma;
        this.modalidade = modalidade;
    }
    public String GetId(){
        return id;
    }
    public String GetDesc(){
        return descricao;
    }
    public String GetAluno(){
        return aluno;
    }
    public String GetTurma(){
        return turma;
    }
    public String GetModalidade(){
        return modalidade;
    }
}
