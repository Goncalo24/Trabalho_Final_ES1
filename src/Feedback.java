public class Feedback {
    String Descricao;
    ClienteEncomenda clienteEncomenda;

    public Feedback(String descricao, ClienteEncomenda clienteEncomenda) {
        Descricao = descricao;
        this.clienteEncomenda = clienteEncomenda;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public ClienteEncomenda getClienteEncomenda() {
        return clienteEncomenda;
    }

    public void setClienteEncomenda(ClienteEncomenda clienteEncomenda) {
        this.clienteEncomenda = clienteEncomenda;
    }
}
