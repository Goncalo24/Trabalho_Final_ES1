import java.time.LocalDate;

public class Notificacao {
    private Envio envio;
    private LocalDate data;
    private String descricao;

    public Notificacao(Envio envio, LocalDate data, String descricao) {
        this.envio = envio;
        this.data = data;
        this.descricao = descricao;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
