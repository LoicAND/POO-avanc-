public class Dog extends Animal {

    Dog(String nom, int age) {
        super(nom, age);
    }

    @Override
    void eat() {
        System.out.println("Le chien mange des croquettes.");
    }
}