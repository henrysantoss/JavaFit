package com.whaise.javafit.Get;

public class GetUsuario {
    private String nome,login,gen;
    
    public GetUsuario(String gen,String nome,String login){
        this.gen = gen;
        this.nome = nome;
        this.login = login;
    }
    public String GetGen(){
        return gen;
    }
    public String GetNome(){
        return nome;
    }
    public String GetLogin(){
        return login;
    }
}
