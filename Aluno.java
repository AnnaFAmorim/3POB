import java.io.Serializable;

public class Aluno implements Serializable {

    public String nome;
    public String matricula;
    private String cpf;
    private String endereco;

    public Aluno (String nome, String matricula, String cpf, String endereco){
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", matricula='" + matricula + '\'' + ", cpf='" + cpf + '\'' + ", endereco='" + endereco + '\'' + '}';
    }
}
