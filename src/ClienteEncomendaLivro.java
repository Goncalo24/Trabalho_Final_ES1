public class ClienteEncomendaLivro {
    EncomendaLivro encomendaLivro;
    Cliente cliente;
    Voucher voucher;

    public ClienteEncomendaLivro(EncomendaLivro encomendaLivro, Cliente cliente, Voucher voucher) {
        this.encomendaLivro = encomendaLivro;
        this.cliente = cliente;
        this.voucher = voucher;
    }

    public EncomendaLivro getEncomendaLivro() {
        return encomendaLivro;
    }

    public void setEncomendaLivro(EncomendaLivro encomendaLivro) {
        this.encomendaLivro = encomendaLivro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }
}
