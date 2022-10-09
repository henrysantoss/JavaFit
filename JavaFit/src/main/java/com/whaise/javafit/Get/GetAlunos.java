package com.whaise.javafit.Get;

public class GetAlunos {
    private String id,nome,sexo,data,cel,fone,email,logradouro,localidade; 

    public GetAlunos(String id,String nome,String sexo,String data,String cel,String fone,String email,String logradouro,String localidade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.data = data;
        this.cel = cel;
        this.fone = fone;
        this.email = email;
        this.logradouro = logradouro;
        this.localidade = localidade;
    }
    
    public String GetId(){
        return id;
    }
    public String GetNome(){
        return nome;
    }
    public String GetSexo(){
        return sexo;
    }
    public String GetData(){
        return data;
    }
    public String GetCel(){
        return cel;
    }
    public String GetFone(){
        return fone;
    }
    public String GetEmail(){
        return email;
    }
    public String GetLogradouro(){
        return logradouro;
    }
    public String GetLocalidade(){
        return localidade;
    }
}
