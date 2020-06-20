import java.util.ArrayList;

public class Repositorio {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<ClienteEncomenda> clienteEncomendas = new ArrayList<>();
    ArrayList<Encomenda> encomendas = new ArrayList<>();
    ArrayList<EncomendaLivro> encomendaLivros = new ArrayList<>();
    ArrayList<Feedback> feedbacks = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Notificacao> notificacaos = new ArrayList<>();
    ArrayList<Transportadora> transportadoras = new ArrayList<>();
    ArrayList<Voucher> vouchers = new ArrayList<>();

    void AdicionaCliente(Cliente cliente){ this.clientes.add(cliente);}
    void AdicionaClienteEncomenda(ClienteEncomenda clienteEncomenda){this.clienteEncomendas.add(clienteEncomenda);}
    void AdicionaEncomenda(Encomenda encomenda){this.encomendas.add(encomenda);}
    void AdicionaEncomendaLivro(EncomendaLivro encomendaLivro){this.encomendaLivros.add(encomendaLivro);}
    void AdicionaFeedback(Feedback feedback){this.feedbacks.add(feedback);}
    void AdicionaFuncionario(Funcionario funcionario){this.funcionarios.add(funcionario);}
    void AdicionaLivro(Livro livro){this.livros.add(livro);}
    void AdicionaNotificacao(Notificacao notificacao){this.notificacaos.add(notificacao);}
    void AdicionaTransportadora(Transportadora transportadora){this.transportadoras.add(transportadora);}
    void AdicionaVoucher(Voucher voucher){this.vouchers.add(voucher);}

    Encomenda DevolveParcialmenteEncomenda(Encomenda e){

    }
}
