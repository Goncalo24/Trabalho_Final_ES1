import java.time.LocalDate;

public class Encomenda {
    private int IdEncomenda;
    private int Estado;
    private LocalDate data;

    public Encomenda(int idEncomenda, int estado, LocalDate data) {
        IdEncomenda = idEncomenda;
        Estado = estado;
        this.data = data;
    }

    public int getIdEncomenda() {
        return IdEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        IdEncomenda = idEncomenda;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
