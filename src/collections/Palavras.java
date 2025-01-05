package collections;
import java.util.HashSet;
import java.util.Scanner;

public class Palavras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Ler a frase do usuário
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        // Dividir a frase em palavras, usando espaços e pontuações como delimitadores
        String[] palavras = frase.toLowerCase().split("\\W+");

        // Usar um conjunto para armazenar palavras únicas
        HashSet<String> palavrasUnicas = new HashSet<>();
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                palavrasUnicas.add(palavra);
            }
        }

        // Exibir o número de palavras únicas
        System.out.println("Número de palavras não repetidas: " + palavrasUnicas.size());
        scanner.close();
    }
}
