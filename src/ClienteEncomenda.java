public class ClienteEncomenda {
    Cliente cliente;
    Encomenda encomenda;

    public ClienteEncomenda(Cliente cliente, Encomenda encomenda) {
        this.cliente = cliente;
        this.encomenda = encomenda;
    }

    public ClienteEncomenda() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
}
