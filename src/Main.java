public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Marguerite", 4);
        Animal.communeRule();

        System.out.println("Nom de l'animal : " + cow.nom);
        cow.makeSound();

        Dog dog = new Dog("Rex", 3);


        dog.eat();
        cow.eat();
    }
}
