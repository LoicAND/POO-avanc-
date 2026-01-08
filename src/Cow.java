public class Cow extends Animal {

    Cow(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void  makeSound() {
        System.out.println("Meuh !");
    }
}
