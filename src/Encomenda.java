public class Encomenda {
    private int IdEncomenda;
    private int Estado;

    public Encomenda(int idEncomenda, int estado) {
        IdEncomenda = idEncomenda;
        Estado = estado;
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
}
