import java.time.LocalDate;

public class Main {
    public static void Main(String args[]) {
        System.out.println("Compra de Livros");

        Repositorio repositorio = new Repositorio();
        String edit = "", titulo = "", desc = "", nome = "", email = "", morada = "", codigo = "";
        int id = 0, estado = 0, quant = 0, stock = 0; /*estado 0 = preparando, estado 1= parcealmente enviado, estado 2= enviado*/
        Double preco = 0.0;
        Livro li = null;
        LocalDate data = null;
        data.getDayOfWeek();

        Cliente c = new Cliente(id, nome, email, morada);
        Encomenda e = new Encomenda(id, estado);
        Livro l = new Livro(titulo, edit, preco, stock);
        Funcionario f = new Funcionario(id, nome);
        Transportadora t = new Transportadora(nome, email);
        Voucher v = new Voucher(codigo, data, data);
        ClienteEncomenda ce = new ClienteEncomenda(c, e);
        EncomendaLivro el = new EncomendaLivro(e, l, quant);
        Feedback fe = new Feedback(desc, ce);
        Notificacao n = new Notificacao(data, ce, f);
    }
}
