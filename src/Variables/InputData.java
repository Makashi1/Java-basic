package Variables;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);
//        wprowadz liczbe
        System.out.println("wprowadź liczbę całkowitą: ");
        int number = scanner.nextInt();
        String enter = scanner.nextLine();
        System.out.println("wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf (" Wprowadziłeś: %f i %s\n ", text, number);
        System.out.printf (" Skonsumowano: \n ",enter);


        scanner.close();
    }
}
