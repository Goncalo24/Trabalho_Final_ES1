import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Loja vritual Ablazon");
        Repositorio repositorio = new Repositorio();

        String nome="", morada ="", email="", titulo="", autor="", descricao="", link="";
        int id=0, estado=0, stock=0, cont=0, desc=0, quant=0, disp=0;
        double valor=0.0;
        LocalDate data=null;
        Date lanc=null;

        Cliente c = new Cliente(nome, morada, email);
        Funcionario f = new Funcionario(nome, email);
        Livro l = new Livro(titulo, autor, lanc, id, stock, valor);
        Transportadora t = new Transportadora(nome, email, cont);
        Voucher v = new Voucher(id, desc, lanc, descricao);

        Encomenda e = new Encomenda(id, data, estado, c, v, valor);
        EncomendaLivro el = new EncomendaLivro(e, l, quant, disp);
        Envio en = new Envio(id, e, t, f, lanc);
        Feedback fe = new Feedback(link, en, descricao, descricao);
        Notificacao no = new Notificacao(en, data, descricao);


        repositorio.adicionaCliente(c);
        repositorio.adicionaFuncionario(f);
        repositorio.adicionaLivro(l);
        repositorio.adicionaTransportadora(t);
        repositorio.adicionaVoucher(v);
        repositorio.adicionaEncomenda(e);
        repositorio.adicionaEncomendaLivro(el);
        repositorio.adicionaEnvio(en);
        repositorio.adicionaFeedback(fe);
        repositorio.adicionaNotificacao(no);
        repositorio.devolveEncomeda(data);
        repositorio.devolveLivrosdaEncomenda(e);

        System.out.println("Data: " + en.getData());
        System.out.println("Encomenda: " + en.getEncomenda().getnEncomenda());
        System.out.println("Cliente: " + en.getEncomenda().getCliente());
        System.out.println("Transportadora: " + en.getTransportadora().getNome());
    }
}
