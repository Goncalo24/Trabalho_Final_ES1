public class Funcionario {
    int IdFuncionario;
    String Nome;

    public Funcionario(int idFuncionario, String nome) {
        IdFuncionario = idFuncionario;
        Nome = nome;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        IdFuncionario = idFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
