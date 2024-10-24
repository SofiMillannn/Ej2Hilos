import java.util.concurrent.Semaphore;

public class Hilitos extends Thread{
    private static Semaphore sem = new Semaphore(1);
    static int nVocales;
    static String frase = Main.getFrase();
    public Hilitos(String name) {
        super(name);
        start();

    }

    public static int getnVocales() {
        return nVocales;
    }

    @Override
    public void run() {

        String[] fraseV = frase.split("");



            for (int i = 0; i < fraseV.length; i++) {
              if (fraseV[i].equalsIgnoreCase(getName())){
                  try {
                      sem.acquire();
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
                  nVocales++;
                  sem.release();
              }


            }



    }
}
