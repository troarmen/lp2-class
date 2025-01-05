package comparable;

import java.util.ArrayList;

public class Usuario implements Comparable<Usuario>{
    private String nome;
    private ArrayList<Post> lista;

    public Usuario(){
        this.nome = "";
        this.lista = new ArrayList<>();
    }

    public Usuario(String nome){
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Post> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Post> lista) {
        this.lista = lista;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((lista == null) ? 0 : lista.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (lista == null) {
            if (other.lista != null)
                return false;
        } else if (!lista.equals(other.lista))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", lista=" + lista + ", getNome()=" + getNome() + ", getLista()=" + getLista()
                + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
                + "]";
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nome.compareTo(o.getNome());
    }
}