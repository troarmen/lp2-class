package exerciciosBernardo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(FileWriter arquivo = new FileWriter("pasta/num.txt")){
            String numero;
            for(int i = 0; i < 10; i++){
                System.out.println("Digite um número: ");
                numero = sc.nextLine();
                arquivo.write(numero);
                arquivo.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}