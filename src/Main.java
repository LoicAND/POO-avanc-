import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog p1 = new Dog("Rex", 5);
        Pet p2 = new Cow("Marguerite", 8);

        p1.play();
        p2.play();

        System.out.println("---- Liste d'Animal ----");

        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new Dog("Spike", 4));
        animaux.add(new Cow("Bella",6));
        animaux.add(new Dog("Luna",3));

        for (Animal a : animaux) {
            System.out.println("Animal : " + a.nom);

            if (a instanceof Pet) {
                ((Pet) a).play();
            }
        }
    }
}

