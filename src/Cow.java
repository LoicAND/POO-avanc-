public class Cow extends Animal implements Pet {

    Cow(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void  makeSound() {
        System.out.println("Meuh !");
    }

    @Override
    public void play() {
        System.out.println(nom + " (vache) joue dans le pré.");
    }
}
