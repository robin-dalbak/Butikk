import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.tools.javac.comp.DeferredAttr;
import java.util.Scanner;

public class CC1 {

    public static void main (String[] args) {
        for (int i = 1; i < 12; i++)
            if (i == 8) {
                System.out.println("hacker ");


            }
    }

        


            /* Coding Challenge 1
        }System.out.println("\t\t\t .");
        System.out.println("\t\t\t\":\" ");
        System.out.println("\t\t  ___:____     |¨\\/¨| ");
        System.out.println("\t\t,'\t\t  `.\t\\  /");
        System.out.println("\t\t|\t0\t\t\\___/  |");
        System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~"); */


        /*Coding Challenge 2
          String yourInitials = ("RDM");
          int populationYourCountry = 5328000;
          long popWorld = 7749655060L;
          String dayOfTheWeek = ("Tuesday");
          byte durationInWeeksJavaCourse = 12;
          double theNumberPi = 3.14159265359;

          System.out.println("My initials are " + yourInitials);
          System.out.println("The population in my country is " + populationYourCountry);
          System.out.println("The population on earth is " + popWorld);
          System.out.println("Today it's " + dayOfTheWeek);
          System.out.println("The java course lasts " + durationInWeeksJavaCourse + " weeks");
          System.out.println("The mathematical number of PI is " + theNumberPi);  */


        /*Coding Challenge 3
       

        System.out.println("Everyone that it would work. then someone came, #UNAWARE# of what everyone said, and just did it");
        System.out.format("Everyone " +  "%S"  + " that it would not work. Then someone came, " + "%s" + "of what everyone said, and just did it.", "SAID", "UNAWARE"); */


        /*Coding Challenge 4

     System.out.println("How many seconds do you have available? ");
     Scanner scanner = new Scanner(System.in);
     long seconds = scanner.nextLong();
     long minutes = seconds / 60;
     short secondsRest = (short) (seconds % 60);

     System.out.println(minutes + " minutes and " + secondsRest + " seconds");
     long hours = minutes / 60;short minutesRest = (short) (minutes % 60);

     System.out.println(hours + " hours and " + minutesRest + " minutes and " + secondsRest + " seconds");
     long days = hours / 24;
     short hoursRest = (short) (hours % 24);

     System.out.println(days + " days and " + hoursRest + " hours and " + minutesRest + " minutes and " + secondsRest + " seconds");
     long years = days / 365;
     short daysRest = (short) (days % 365);

     System.out.println(years + " years and " + daysRest + " days and " + hoursRest + " hours and " + minutesRest + " minutes and " + secondsRest + " seconds"); */

       /*

 import java.util.Scanner;
 import java.util.concurrent.ThreadLocalRandom;


 public class Main {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("Number of laps: ");
         int numberOfLaps = scanner.nextInt();


         double[] lapTimes = new double[numberOfLaps];

         for (int i = 0; i < numberOfLaps; i++) {
             System.out.print("Lap time: ");
             lapTimes[i] = scanner.nextDouble();
         }


         //fastestTime = 52.94
         // i = 4
         double fastestTime = lapTimes[0];
         for (int i = 1; i < lapTimes.length; i++) {
             if (lapTimes[i] < fastestTime) {
                 fastestTime = lapTimes[i];

             }
         }

         System.out.println("Fastest time: " + fastestTime);

        */



}
