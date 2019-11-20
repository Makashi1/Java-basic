package java_introduction;
//CTRL + / --> komentarz jednowierszowy
//CTRL

public class java_introduction {
//    metoda uruchumieniowa - automatyczne
//    psmv - skrot
public static void main(String[] args) {
//    sop
    System.out.println("Hello world");
    System.out.println(System.getProperty("java.runtime.version"));
    System.out.println(System.getProperty("java.version"));
//    typt danych
    int myFirstNumber = 50;

double salaryNet = 9000;
int vatTax = 23;
    System.out.println("Kwota netto:"  + salaryNet + "zł");
    System.out.println("Kwota brutto:"  + (salaryNet * (1 + (vatTax/100.0))) + "zł");
    System.out.printf("%.2fzł netto to %.2fzł brutto", salaryNet, salaryNet * (1 + (vatTax/100.0)) );


    char smallLetter ='a';
    char bigLetter = 'A';
    char dotChar = '.';

    System.out.println(smallLetter);
    System.out.println((char) (bigLetter +10) );
    System.out.printf("Znak: %c na %d numer ASCII\n ",dotChar, (int)dotChar);

    boolean isActivated = true;
    System.out.println( isActivated );
    System.out.println( !isActivated );






}
}
