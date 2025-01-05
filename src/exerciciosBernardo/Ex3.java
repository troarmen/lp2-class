package exerciciosBernardo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<Integer>();
        FileOutputStream pares = null;
        FileOutputStream impares = null;

        for (int i = 0; i <= 10; i++){
            int numeroAleatorio = random.nextInt(100) + 1;
            numeros.add(numeroAleatorio);
        }

        try{
            pares = new FileOutputStream("pasta/pares.txt");
            impares = new FileOutputStream("pasta/impares.txt");
            for (int numero: numeros) {
                if(numero % 2 == 0){
                    pares.write(numero);
                }else{
                    impares.write(numero);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
