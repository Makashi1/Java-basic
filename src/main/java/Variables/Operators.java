package Variables;

import java.util.Scanner;

public class Operators {
    public static void  main(String[] args) {
        int i = 5;
        int j = 4;
//        post inkrementacja
        System.out.println ( i ++);
        System.out.println ( i );
// pre dekrementacja
        System.out.println( --j );
        System.out.println( j );


//        sprawdz czy uzytkownik jest pełno letni
//        jezeli jego wiek jest >= 18 lat to wypisz jestes pełnoletni
//        jesli nie tez napisz , ze  nie jestes

        int age;

//        uzytkownik wprowadza wartosc
        Scanner scanner = new Scanner(System.in);
//        metoda to nextInt()
        System.out.println("Wprowadź swój wiek:" );
        age = scanner.nextInt() ;
        System.out.println((age <= 100) ? "jesteś człowiekiem" : "jesteś robotem");

       boolean isHuman = age >= 0 && age <=120 ? true : false ;
       String isMature = age >= 18 ? "jesteś dorosły" : "nie jestes dorosły";

        System.out.println( isHuman ? isMature : "ROBOT");







    }
}
