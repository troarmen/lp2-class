package atividade1;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno extends Pessoa {
    private String prontuario;

    // Construtor padrão
    public Aluno() {
        super();
    }

    // Construtor com argumentos
    public Aluno(String nome, int dia, int mes, int ano, String prontuario) {
        super(nome, dia, mes, ano);
        this.prontuario = prontuario;
    }

    // Getter e Setter para o atributo prontuario
    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(prontuario, aluno.prontuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prontuario);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getDataNasc() +
                ", prontuario='" + prontuario + '\'' +
                '}';
    }
}
