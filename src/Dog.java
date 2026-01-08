public class Dog extends Animal implements Pet {

    Dog(String nom, int age) {
        super(nom, age);
    }


    @Override
    public void play() {
        System.out.println(nom + " (chien) joue avec une balle.");
    }
}
