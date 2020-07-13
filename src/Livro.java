import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private Date anoLanc;
    private int referencia;
    private int stock;
    private double preco;

    public Livro(String titulo, String autor, Date anoLanc, int referencia, int stock, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLanc = anoLanc;
        this.referencia = referencia;
        this.stock = stock;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(Date anoLanc) {
        this.anoLanc = anoLanc;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
