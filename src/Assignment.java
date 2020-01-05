import java.util.Scanner;
import java.util.ArrayList;



public class Assignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Rema1000, hva vil du kjøpe? ");
        System.out.print("Antall produkter: ");
        int antallVarer = scanner.nextInt();


        double[] lapTimes = new double[antallVarer];

        for (int i = 0; i < antallVarer; i++) {
            System.out.println("Produkt # ");
            System.out.print("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        }


        double fastestTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];

            }
        }

        System.out.println("Fastest time: " + fastestTime);


    }

}


