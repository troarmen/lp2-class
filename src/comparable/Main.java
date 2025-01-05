package comparable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Trastamad");
        Post post1 = new Post(LocalDateTime.of(2023, 12, 1, 10, 30), "Primeiro post");
        Post post2 = new Post(LocalDateTime.of(2023, 12, 2, 14, 0), "Segundo post");
        Post post3 = new Post(LocalDateTime.of(2023, 11, 30, 18, 45), "Terceiro post");

        ArrayList<Post> lista = new ArrayList<Post>();
        lista.add(post1);
        lista.add(post2);
        lista.add(post3);

        usuario.setLista(lista);

        ArrayList<Post> posts = usuario.getLista();
        posts.sort(Collections.reverseOrder());

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
