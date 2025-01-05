package exerciciosBernardo;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ex2 {
    public static void main(String[] args) {
        FileInputStream entrada = null;
        FileOutputStream menor = null;
        FileOutputStream maior = null;

        try{
            entrada = new FileInputStream("pasta/entrada.txt");
            menor = new FileOutputStream("pasta/menor.txt");
            maior = new FileOutputStream("pasta/maior.txt");

            int data;
            while((data = entrada.read()) != -1){
                //byte b = (byte) data;
                if(data <= 128){
                    menor.write(data);
                }else if(data > 128){
                    maior.write(data);
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
