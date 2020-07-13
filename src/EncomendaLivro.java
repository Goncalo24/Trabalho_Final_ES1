public class EncomendaLivro {
    private Encomenda encomenda;
    private Livro livro;
    private int quantidade;
    private int disponibilidade;

    public EncomendaLivro(Encomenda encomenda, Livro livro, int quantidade, int disponibilidade) {
        this.encomenda = encomenda;
        this.livro = livro;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
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
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
