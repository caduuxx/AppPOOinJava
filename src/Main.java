import dominio.Cliente;
import dominio.Atendete;
import dominio.Tecnico;
import servicos.Material;
import servicos.ServicoServicos;
import servicos.SolicitacaoServico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Atendete atendente = new Atendete();
        Tecnico tecnico = new Tecnico();
        Material material = new Material();
        SolicitacaoServico solicitacaoServico = new SolicitacaoServico(1, 101, 201, 301, 401,
                new Date(), null, null);

        cliente.setId_Pessoa(101);
        cliente.setNome("Cliente1");
        cliente.setCpf(123456789);
        cliente.setEndereco("EnderecoCliente1");
        cliente.setTelefone("123456789");

        atendente.setId_Pessoa(201);
        atendente.setNome("Atendente1");
        atendente.setCpf(987654321);

        tecnico.setId_Pessoa(301);
        tecnico.setNome("Tecnico1");
        tecnico.setCpf(111222333);
        tecnico.setTelefone("987654321");

        material.setIdMaterial(401);
        material.setDescricao("Material1");
        material.setValor(50.00);

        System.out.println("=== Cliente ===");
        System.out.println("Informações do Cliente: " + cliente.ExibirIformacoes());
        Cliente.SolicitaServico();

        System.out.println("\n=== Atendente ===");
        System.out.println("Informações do Atendente: " + atendente.ExibirIformacoes());
        Atendete.registrarInformaçoes();

        System.out.println("\n=== Técnico ===");
        System.out.println("Informações do Técnico: " + tecnico.ExibirIformacoes());
        Tecnico.registraInformacoes();

        System.out.println("\n=== Material ===");
        System.out.println("Informações do Material: " + material.exibeInformacoes());

        System.out.println("\n=== Solicitação de Serviço ===");
        solicitacaoServico.registraSolicitacaoServico();
        solicitacaoServico.atribuiServico(tecnico.getId_Pessoa());
        solicitacaoServico.registraInicioServico();
        solicitacaoServico.registraConclusaoServico();
        solicitacaoServico.registraMaterial(material.getIdMaterial());
        solicitacaoServico.exibeInformacoes();

        System.out.println("\n=== Serviço ===");
        ServicoServicos servicoServicos = new ServicoServicos();
        servicoServicos.setIdServico(501);
        servicoServicos.setDescricao("Servico1");
        servicoServicos.setValor(100.00);
        System.out.println("Informações do Serviço: " + servicoServicos.exibeInformacoes());

    }
}
