package servicos;

public class Material {
    private int idMaterial;
    private String Descricao;
    private double valor;
    public String informacoes = idMaterial+ Descricao+ valor;

    //METODOS
    public String exibeInformacoes(){
        return informacoes;
    }




    // GET AND SET
    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
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
