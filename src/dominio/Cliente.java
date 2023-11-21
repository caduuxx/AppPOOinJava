package dominio;

public class Cliente extends Pessoa{

    private String endereco;
    private String telefone;

    // metodos

    public static void SolicitaServico(){

    }

    // get e set
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
