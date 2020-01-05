import java.util.Scanner;
import java.util.ArrayList;



public class Assignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Rema1000, hva vil du kjøpe? ");
        System.out.print("Antall produkter: ");
        int antallVarer = scanner.nextInt();


        double[] priser = new double[antallVarer];
        String[] varer = new String[antallVarer];

        for (int i = 0; i < antallVarer; i++) {
            System.out.print("Vare: ");
            varer[i] = scanner.next();
            System.out.print("Pris: ");
            priser[i] = scanner.nextDouble();
        }

        System.out.println("Handleliste: ");
        String billigsteVare = varer[0];
        double billigstePris = priser[0];


        String dyresteVare = null;
        for (int i = 0; i < antallVarer; i++) {
            System.out.println(varer[i] + ": " + priser[i]);
            if (billigstePris > priser[i]) {
                billigsteVare = varer[i];
                billigstePris = priser[i];

            }
            dyresteVare = varer[1];
            double dyrestePris = priser[1];

            if (dyrestePris < priser[0]) {
                dyresteVare = varer[0];
                dyrestePris = priser[0];

            }

        }

        System.out.println("Billigste vare = " + billigsteVare);
        System.out.println("Dyreste vare = " + dyresteVare);
        System.out.println("Takk for handelen, velkommen tilbake til Rema1000");

    }

}


