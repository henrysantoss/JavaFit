package com.whaise.javafit.Get;

public class GetModalidade {
    private String id,descricao,dias,pagamento,desconto,vlfinal;
    
    public GetModalidade(String id,String descricao,String dias,String pagamento,String desconto,String vlfinal){
        this.id = id;
        this.descricao = descricao;
        this.dias = dias;
        this.pagamento = pagamento;
        this.desconto = desconto;
        this.vlfinal = vlfinal;
    }
    public String GetId(){
        return id;
    }
    public String GetDescricao(){
        return descricao;
    }
    public String GetDias(){
        return dias;
    }
    public String GetPagamento(){
        return pagamento;
    }
    public String GetDesconto(){
        return desconto;
    }
    public String getVlFinal(){
        return vlfinal;
    }
}
