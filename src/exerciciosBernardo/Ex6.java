package exerciciosBernardo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6 {
    public static void main(String[] args) {
        FileReader arquivo = null;
        int contaChar = 0;
        int contaVogal = 0;
        int contaCon = 0;

        try {
            arquivo = new FileReader("pasta/texto.txt");
            int caractere;

            while ((caractere = arquivo.read()) != -1) {
                char letra = (char) caractere;
                System.out.print(letra);
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    contaVogal += 1;
                } else if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                    contaVogal += 1;
                }else{
                    contaCon += 1;
                }
                contaChar += 1;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nLetras: "+contaChar);
        System.out.println("Vogais: "+contaVogal);
        System.out.println("Consoantes: "+contaCon);
    }
}
