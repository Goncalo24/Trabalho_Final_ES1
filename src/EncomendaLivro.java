public class EncomendaLivro {
    Encomenda encomenda;
    Livro livro;
    private int Quantidade;

    public EncomendaLivro(Encomenda encomenda, Livro livro, int quantidade) {
        this.encomenda = encomenda;
        this.livro = livro;
        Quantidade = quantidade;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
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
}
