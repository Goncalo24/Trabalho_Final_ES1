import java.util.Date;

public class Envio {
    private int nEnvio;
    private Encomenda encomenda;
    private EncomendaLivro encomendaLivro;
    private Transportadora transportadora;
    private Funcionario funcionario;
    private Date data;

    public Envio(int nEnvio, Encomenda encomenda, EncomendaLivro encomendaLivro, Transportadora transportadora, Funcionario funcionario, Date data) {
        this.nEnvio = nEnvio;
        this.encomenda = encomenda;
        this.encomendaLivro = encomendaLivro;
        this.transportadora = transportadora;
        this.funcionario = funcionario;
        this.data = data;
    }

    public int getnEnvio() {
        return nEnvio;
    }

    public void setnEnvio(int nEnvio) {
        this.nEnvio = nEnvio;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public EncomendaLivro getEncomendaLivro() {
        return encomendaLivro;
    }

    public void setEncomendaLivro(EncomendaLivro encomendaLivro) {
        this.encomendaLivro = encomendaLivro;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
