import java.time.LocalDate;

public class Notificacao {
    LocalDate data;
    ClienteEncomenda clienteEncomenda;
    Funcionario funcionario;

    public Notificacao(LocalDate data, ClienteEncomenda clienteEncomenda, Funcionario funcionario) {
        this.data = data;
        this.clienteEncomenda = clienteEncomenda;
        this.funcionario = funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ClienteEncomenda getClienteEncomenda() {
        return clienteEncomenda;
    }

    public void setClienteEncomenda(ClienteEncomenda clienteEncomenda) {
        this.clienteEncomenda = clienteEncomenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
