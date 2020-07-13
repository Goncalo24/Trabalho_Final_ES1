import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Repositorio {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Encomenda> encomendas = new ArrayList<>();
    ArrayList<EncomendaLivro> encomendaLivros = new ArrayList<>();
    ArrayList<Envio> envios = new ArrayList<>();
    ArrayList<Feedback> feedbacks = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Notificacao> notificacaos = new ArrayList<>();
    ArrayList<Transportadora> transportadoras = new ArrayList<>();
    ArrayList<Voucher> vouchers = new ArrayList<>();

    void adicionaCliente(Cliente cliente){ this.clientes.add(cliente);}
    void adicionaEncomenda(Encomenda encomenda){this.encomendas.add(encomenda);}
    void adicionaEncomendaLivro(EncomendaLivro encomendaLivro){this.encomendaLivros.add(encomendaLivro);}
    void adicionaEnvio(Envio envio){this.envios.add(envio);}
    void adicionaFeedback(Feedback feedback){this.feedbacks.add(feedback);}
    void adicionaFuncionario(Funcionario funcionario){this.funcionarios.add(funcionario);}
    void adicionaLivro(Livro livro){this.livros.add(livro);}
    void adicionaNotificacao(Notificacao notificacao){this.notificacaos.add(notificacao);}
    void adicionaTransportadora(Transportadora transportadora){this.transportadoras.add(transportadora);}
    void adicionaVoucher(Voucher voucher){this.vouchers.add(voucher);}

    Encomenda devolveEncomeda(LocalDate datapesquisa){
        for (int i = 0; i<this.encomendas.size(); i++)
        {
            if (encomendas.get(i).getData() == datapesquisa)
            {
                return encomendas.get(i);
            }
        }
        return null;
    }

    EncomendaLivro devolveLivrosdaEncomenda(Encomenda encomenda){
        for (int i = 0; i<this.encomendaLivros.size(); i++)
        {
            if (encomendaLivros.get(i).getEncomenda() == encomenda);{
                return encomendaLivros.get(i);
            }
        }
        return null;
    }
}
