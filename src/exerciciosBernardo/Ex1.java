package exerciciosBernardo;

import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeArquivo;
        System.out.println("Digite o nome do arquivo: ");
        nomeArquivo = sc.nextLine();
        
        try {
            InputStream input = new FileInputStream("pasta/"+nomeArquivo);
            int leitura;
            
            while((leitura = input.read()) != -1){
                byte b = (byte) leitura;
                System.out.println(""+b);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}