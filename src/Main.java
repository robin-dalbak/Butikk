import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    static int totalItems;
    static String[] varer;
    static double[] priser;


    public static void main(String[] args) {

        System.out.println("Velkommen til Rema1000");
        totalItems = getNumberOfItems("Hvor mange varer vil du kjøpe i dag? ");
        varer = new String[totalItems];
        priser = new double[totalItems];


        int count = 0;
        while (count < totalItems) {
            getItemDetails(count);
            count++;
        }
          displayCart();

        

    }

    private static void getItemDetails(int index) {
           varer[index] = getItemName("Hva er navnet på vare #" + (index+1) + " ? ");
           priser[index] = getItemPrice("Hva er prisen på varen? ");

    }

    private static void displayCart() {

        System.out.println("#################################");
        System.out.println("Handlekurv");
        System.out.println("##################################");


        for (int i=0; i < totalItems; i++) {
           showLineItem(i);
        }

        System.out.println("#################################");
      
      
    }

    private static void showLineItem(int index) {


        String itemText =  varer[index] + ".............."; // pencils
        String priceText = priser[index] + " = " + priser[index];
        
        System.out.println(itemText + priceText);
    }

    private static double getItemPrice(String m) {
        System.out.print(m);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();


    }

    private static String getItemName(String m) {
        System.out.print(m);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static int getItemQuantity(String m) {
        System.out.print(m);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    private static int getNumberOfItems(String m) {
        System.out.print(m);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();



    }

}