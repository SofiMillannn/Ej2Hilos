import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String frase;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime algo: ");
        try {
            frase = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread hiloA = new Hilitos("A");
        Thread hiloE = new Hilitos("E");
        Thread hiloI = new Hilitos("I");
        Thread hiloO = new Hilitos("O");
        Thread hiloU = new Hilitos("U");

        try {
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Numero de vocales: " + Hilitos.getnVocales());
    }

    public static String getFrase() {
        return frase;
    }

    public static void setFrase(String frase) {
        Main.frase = frase;
    }
}