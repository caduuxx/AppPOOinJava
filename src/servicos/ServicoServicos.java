package servicos;

public class ServicoServicos {

    private int idServico;
    private String Descricao;
    private double valor;

    public String informacoes = idServico + Descricao + valor;

    //METODOS

    public String exibeInformacoes(){
        return informacoes;
    }


    //GET AND SET

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
