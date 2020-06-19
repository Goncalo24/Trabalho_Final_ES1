public class Cliente {
    private int IdCliente;
    private String Nome;
    private String Email;
    private String Morada;

    public Cliente(int idCliente, String nome, String email, String morada) {
        IdCliente = idCliente;
        Nome = nome;
        Email = email;
        Morada = morada;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String morada) {
        Morada = morada;
    }
}
