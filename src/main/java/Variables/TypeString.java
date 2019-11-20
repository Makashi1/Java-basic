package Variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.1234";
        System.out.println("text = " + text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Trzeci znak napisu: " + text.charAt(2));
        System.out.println("Ostatni znak napisu: " + text.charAt(text.length()  -1));


        System.out.println("y znajduje sie na indeksie: " + text.indexOf('y') );
        System.out.println("spacja znajduje sie na indeksie: " + text.indexOf(' ') );
        System.out.println("napis znajduje sie na indeksie: " + text.indexOf("napis") );

        System.out.println("Długość napisu w zmiennej text: " + text.length()) ;
        String napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Być albo nie być";
        String updateCite = cite.replaceAll("ć", "c");
        System.out.println(cite);
        System.out.println(updateCite);

        String numer1 = "Ala";
        String numer2 = "ALA";

        System.out.println(numer1.equals(numer2));
        System.out.println(numer1.length() >= numer2.length());

        String name= "Michał";



//sprawdzanie czy tekst jest palidromem

        String txt = "KAJAK";
        System.out.println(" txt ");
        StringBuffer editableTxt = new StringBuffer(txt);
        editableTxt.reverse();
        String txtReversed = editableTxt.toString();
        System.out.println(editableTxt);

        System.out.println("Czy napis jest palidromem: " + txt.equals ( txtReversed ));

        String sentence = "Być albo nie być oto jest pytanie";
//        podziel zdanie na wyrazy
        String [] words = sentence.split(" ");
        System.out.println(words [0]);
        System.out.println(words [1]);
        System.out.println(words [2]);
        System.out.println(words [3]);
        System.out.println(words [4]);
        System.out.println(words [5]);
        System.out.println(words [6]);

    }

}
