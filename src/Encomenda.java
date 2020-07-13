import java.time.LocalDate;

public class Encomenda {
    private int nEncomenda;
    private LocalDate data;
    private int estado;
    private Cliente cliente;
    private Voucher voucher;
    private double valorEncomenda;

    public Encomenda(int nEncomenda, LocalDate data, int estado, Cliente cliente, Voucher voucher, double valorEncomenda) {
        this.nEncomenda = nEncomenda;
        this.data = data;
        this.estado = estado;
        this.cliente = cliente;
        this.voucher = voucher;
        this.valorEncomenda = valorEncomenda;
    }

    public int getnEncomenda() {
        return nEncomenda;
    }

    public void setnEncomenda(int nEncomenda) {
        this.nEncomenda = nEncomenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
}
