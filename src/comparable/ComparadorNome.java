package comparable;

public class ComparadorNome {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Trastamad");
        Usuario usuario2 = new Usuario("Njteh");

        System.out.println(usuario1.compareTo(usuario2));
    }
}
