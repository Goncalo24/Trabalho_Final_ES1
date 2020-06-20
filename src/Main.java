import java.time.LocalDate;

public class Main {
    public static void Main(String args[]) {
        System.out.println("Compra de Livros");

        Repositorio repositorio = new Repositorio();
        String edit = "", titulo = "", desc = "", nome = "", email = "", morada = "", codigo = "", tracking = "";
        int i = 0, id = 0, estado = 0, quant = 0, stock = 0; /*estado 0 = preparando, estado 1= parcealmente enviado, estado 2= enviado*/
        Double preco = 0.0, desconto = 0.0;
        Livro li = null;
        LocalDate data = null;
        data.getDayOfWeek();

        Cliente c = new Cliente(id, nome, email, morada);
        Encomenda e = new Encomenda(id, estado, data);
        Livro l = new Livro(titulo, edit, preco, stock);
        Funcionario f = new Funcionario(id, nome);
        Transportadora t = new Transportadora(nome, email);
        Voucher v = new Voucher(codigo, data, data, desconto);
        ClienteEncomenda ce = new ClienteEncomenda(c, e);
        EncomendaLivro el = new EncomendaLivro(e, l, quant);
        Feedback fe = new Feedback(desc, ce);
        Notificacao n = new Notificacao(data, ce, f);
        ClienteEncomendaTransportadora cet = new ClienteEncomendaTransportadora(t, data, tracking);
        ClienteEncomendaLivro cel = new ClienteEncomendaLivro(el, c, v);

        repositorio.AdicionaCliente(c);
        repositorio.AdicionaClienteEncomenda(ce);
        repositorio.AdicionaEncomenda(e);
        repositorio.AdicionaEncomendaLivro(el);
        repositorio.AdicionaFeedback(fe);
        repositorio.AdicionaFuncionario(f);
        repositorio.AdicionaLivro(l);
        repositorio.AdicionaNotificacao(n);
        repositorio.AdicionaTransportadora(t);
        repositorio.AdicionaVoucher(v);
        repositorio.AdicionaClienteEncomendaTransportadora(cet);
        repositorio.AdicionaClienteEncomendaLivro(cel);

        System.out.println("Data: " + cel.getEncomendaLivro().getEncomenda().getData());
        System.out.println("Nome: " + cel.getCliente().getNome());
        System.out.println("Livro: " + cel.getEncomendaLivro().getLivro());
        System.out.println("Quantidade: " + cel.getEncomendaLivro().getQuantidade());
    }
}
