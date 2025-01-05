package exerciciosBernardo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        String mensagem;

        // Solicita ao usuário que digite a mensagem
        System.out.println("Digite para gravar no arquivo: ");
        mensagem = sc.nextLine();

        // Nome do arquivo para gravação
        String nomeArquivo = "pasta/mensagem.txt";

        // Usa try-with-resources para garantir que o FileWriter seja fechado
        try (FileWriter arquivo = new FileWriter(nomeArquivo)) {
            arquivo.write(mensagem);
            System.out.println("Mensagem gravada com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar a mensagem no arquivo.");
            e.printStackTrace();
        }

        // Fecha o Scanner
        sc.close();
    }
}
