package servicos;

import java.util.Date;

public class SolicitacaoServico{
    private int IdSolicitacao;
    private int IdCliente;
    private int IdTecnico;
    private int IdAtendente;
    private int IdMaterial;
    public Date dataSolicitacao;
    public Date dataInicio;
    public Date dataConclusao;
    // METODOS

    // COSTRUTOR
    public SolicitacaoServico(int idSolicitacao, int idCliente, int idTecnico, int idAtendente, int idMaterial,
                              Date dataSolicitacao, Date dataInicio, Date dataConclusao) {
        IdSolicitacao = idSolicitacao;
        IdCliente = idCliente;
        IdTecnico = idTecnico;
        IdAtendente = idAtendente;
        IdMaterial = idMaterial;
        this.dataSolicitacao = dataSolicitacao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
    }
    // METODO
    public void registraSolicitacaoServico() {
        // Lógica para registrar a solicitação de serviço
        System.out.println("Solicitação de serviço registrada com sucesso!");
        System.out.println("ID da Solicitação: " + IdSolicitacao);
        System.out.println("ID do Cliente: " + IdCliente);
        System.out.println("ID do Técnico: " + IdTecnico);
        System.out.println("ID do Atendente: " + IdAtendente);
        System.out.println("ID do Material: " + IdMaterial);
        System.out.println("Data de Solicitação: " + dataSolicitacao);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Conclusão: " + dataConclusao);

    }

    // Método para atribuir um serviço a uma solicitação
    public void atribuiServico(int idTecnico) {
        // Lógica para atribuir o serviço
        this.IdTecnico = idTecnico;
        System.out.println("Serviço atribuído ao técnico com ID: " + idTecnico);
    }

    // Método para registrar o início do serviço
    public void registraInicioServico() {
        // Lógica para registrar o início do serviço
        this.dataInicio = new Date();
        System.out.println("Início do serviço registrado em: " + this.dataInicio);
    }

    // Método para registrar a conclusão do serviço
    public void registraConclusaoServico() {
        // Lógica para registrar a conclusão do serviço
        this.dataConclusao = new Date();
        System.out.println("Conclusão do serviço registrado em: " + this.dataConclusao);
    }

    // Método para registrar um material utilizado no serviço
    public void registraMaterial(int idMaterial) {
        // Lógica para registrar o material
        this.IdMaterial = idMaterial;
        System.out.println("Material registrado com ID: " + idMaterial);
    }

    // Método para exibir informações da solicitação de serviço
    public void exibeInformacoes() {
        // Lógica para exibir informações
        System.out.println("Informações da Solicitação de Serviço:");
        System.out.println("ID da Solicitação: " + IdSolicitacao);
        System.out.println("ID do Cliente: " + IdCliente);
        System.out.println("ID do Técnico: " + IdTecnico);
        System.out.println("ID do Atendente: " + IdAtendente);
        System.out.println("ID do Material: " + IdMaterial);
        System.out.println("Data de Solicitação: " + dataSolicitacao);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Conclusão: " + dataConclusao);
    }


    //GET AND SET
    public int getIdSolicitacao() {
        return IdSolicitacao;
    }

    public void setIdSolicitacao(int idSolicitacao) {
        IdSolicitacao = idSolicitacao;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public int getIdTecnico() {
        return IdTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        IdTecnico = idTecnico;
    }

    public int getIdAtendente() {
        return IdAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        IdAtendente = idAtendente;
    }

    public int getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        IdMaterial = idMaterial;
    }


}
