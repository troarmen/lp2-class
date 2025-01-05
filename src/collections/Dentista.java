package collections;

import java.util.Objects;

public class Dentista {
    private String nome;
    private int idade;

    public Dentista(){

    }

    public Dentista(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dentista dentista = (Dentista) o;
        return idade == dentista.idade && Objects.equals(nome, dentista.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
