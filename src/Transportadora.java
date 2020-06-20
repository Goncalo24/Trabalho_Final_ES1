public class Transportadora {
    private String Nome;
    private String Email;

    public Transportadora(String nome, String email) {
        Nome = nome;
        Email = email;
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
}
