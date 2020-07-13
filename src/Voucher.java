import java.util.Date;

public class Voucher {
    private int codigoVoucher;
    private int desconto;
    private Date validade;
    private String descricao;

    public Voucher(int codigoVoucher, int desconto, Date validade, String descricao) {
        this.codigoVoucher = codigoVoucher;
        this.desconto = desconto;
        this.validade = validade;
        this.descricao = descricao;
    }

    public int getCodigoVoucher() {
        return codigoVoucher;
    }

    public void setCodigoVoucher(int codigoVoucher) {
        this.codigoVoucher = codigoVoucher;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
