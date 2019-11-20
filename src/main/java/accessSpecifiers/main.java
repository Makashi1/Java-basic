package accessSpecifiers;

import accessSpecifiers.animal.Animal;
import accessSpecifiers.mammal.Mammal;
import accessSpecifiers.repitle.Reptile;

public class main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.setAge(10);
        System.out.println(mammal);

        Reptile reptile = new Reptile();
        //System.out.println(reptile.name); nie jest widoczny poza pakietem
        Animal animal = new Animal();
        animal.speed
    }
}
