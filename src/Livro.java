public class Livro {
    private String Titulo;
    private String Editora;
    private Double Preço;
    private int Stock;

    public Livro(String titulo, String editora, Double preço, int stock) {
        Titulo = titulo;
        Editora = editora;
        Preço = preço;
        Stock = stock;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public Double getPreço() {
        return Preço;
    }

    public void setPreço(Double preço) {
        Preço = preço;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
