import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String frase;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime algo: ");
        frase = br.readLine();
        Thread hiloA = new Hilitos("A");
        Thread hiloE = new Hilitos("E");
        Thread hiloI = new Hilitos("I");
        Thread hiloO = new Hilitos("O");
        Thread hiloU = new Hilitos("U");

        hiloA.join();
        hiloE.join();
        hiloI.join();
        hiloO.join();
        hiloU.join();

    }

    public static String getFrase() {
        return frase;
    }

    public static void setFrase(String frase) {
        Main.frase = frase;
    }
}