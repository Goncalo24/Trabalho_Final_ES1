public class Encomenda {
    private int IdEncomenda;
    private Livro livro;
    private int Quantidade;
    private int Estado;

    public Encomenda(int idEncomenda, Livro livro, int quantidade, int estado) {
        IdEncomenda = idEncomenda;
        this.livro = livro;
        Quantidade = quantidade;
        Estado = estado;
    }

    public int getIdEncomenda() {
        return IdEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        IdEncomenda = idEncomenda;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }
}
