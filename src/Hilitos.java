public class Hilitos extends Thread{
    static int nVocales;
    static String frase = Main.getFrase();
    public Hilitos(String name) {
        super(name);
        start();

    }

    @Override
    public void run() {

        String[] fraseV = frase.split("");
        if (getName().equals(getName())){
            for (int i = 0; i < fraseV.length; i++) {
              if (fraseV[i].equalsIgnoreCase(getName())){
                  nVocales++;
              }


            }

        }
        System.out.println("Numero de vocales: " + nVocales);
    }
}
