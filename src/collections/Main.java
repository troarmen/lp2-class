package collections;

public class Main {
    public static void main(String[] args) {
        Dentista d1 = new Dentista("Tro", 18);
        Dentista d2 = new Dentista("Daron", 16);
        Dentista d3 = new Dentista();

        System.out.println(d1.toString());
        System.out.println(d2.hashCode());
        System.out.println(d1.equals(d3));
    }
}
