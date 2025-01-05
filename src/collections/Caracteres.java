package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Caracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite ums frase: ");
        String frase = scanner.nextLine();

        HashSet<Character> c1 = new HashSet<>();
        TreeSet<Character> c2 = new TreeSet<>();
        for (char c : frase.toCharArray()) {
            c1.add(c);
            c2.add(c);
        }

        for(char co : c1){
            System.out.print(co);
        }
        for(char co : c2){
            System.out.print(co);
        }
    }
}
