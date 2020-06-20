import java.time.LocalDate;

public class Voucher {
    String Codigo;
    LocalDate Data_Inicio;
    LocalDate Data_Fim;
    Double desconto;

    public Voucher(String codigo, LocalDate data_Inicio, LocalDate data_Fim, Double desconto) {
        Codigo = codigo;
        Data_Inicio = data_Inicio;
        Data_Fim = data_Fim;
        this.desconto = desconto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public LocalDate getData_Inicio() {
        return Data_Inicio;
    }

    public void setData_Inicio(LocalDate data_Inicio) {
        Data_Inicio = data_Inicio;
    }

    public LocalDate getData_Fim() {
        return Data_Fim;
    }

    public void setData_Fim(LocalDate data_Fim) {
        Data_Fim = data_Fim;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
