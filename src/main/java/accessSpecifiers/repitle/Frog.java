package accessSpecifiers.repitle;
//sprawdza czy frog ma dostep klasy reptile

public class Frog {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        reptile.name = "Crazy";     // widoczne w pakiecie repltile
        System.out.println(reptile.getName());
    }
}
