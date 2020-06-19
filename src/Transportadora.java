public class Transportadora {
    private int IdTransportadora;
    private String Nome;
    private String Email;

    public int getIdTransportadora() {
        return IdTransportadora;
    }

    public void setIdTransportadora(int idTransportadora) {
        IdTransportadora = idTransportadora;
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

    public Transportadora(int idTransportadora, String nome, String email) {
        IdTransportadora = idTransportadora;
        Nome = nome;
        Email = email;
    }
}
