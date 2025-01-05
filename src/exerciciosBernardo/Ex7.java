package exerciciosBernardo;

import java.io.*;

public class Ex7 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidadeNotas = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader("pasta/notas.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null && quantidadeNotas < 4) {
                try {
                    int nota = Integer.parseInt(linha.trim());
                    soma += nota;
                    quantidadeNotas++;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido encontrado no arquivo: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        if (quantidadeNotas == 4) {
            double media = (double) soma / quantidadeNotas;
            System.out.println("Média das notas: " + media);

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter("pasta/notas.txt", true))) {
                escritor.newLine(); // Adiciona uma nova linha antes de escrever a média
                escritor.write("Média das notas: " + media);
                System.out.println("Média salva no arquivo com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Erro: O arquivo deve conter exatamente 4 notas.");
        }
    }
}
