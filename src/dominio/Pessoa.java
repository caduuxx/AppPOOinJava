package dominio;

public class Pessoa {
    private int id_Pessoa;
    private String nome;
    private int cpf;
    public String Informacoes = id_Pessoa + nome + cpf;

    // metodos
    public String ExibirIformacoes(){
         return Informacoes;
    }

    // get e set
    public int getId_Pessoa() {
        return id_Pessoa;
    }

    public void setId_Pessoa(int id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }



}
