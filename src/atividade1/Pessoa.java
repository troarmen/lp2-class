package atividade1;

import java.time.LocalDate;
import java.util.Objects;


public class Pessoa {
    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String nome, int ano, int mes, int dia){
        this.nome = nome;
        dataNasc = LocalDate.of(ano, mes, dia);
    }

    public Pessoa() {

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(LocalDate dataNasc){
        this.dataNasc = dataNasc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(dataNasc, pessoa.dataNasc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNasc);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + dataNasc +
                '}';
    }
}
