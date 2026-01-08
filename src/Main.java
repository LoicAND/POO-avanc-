public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Marguerite", 4);
        Animal.communeRule();

        System.out.println("Nom de l'animal : " + cow.nom);
        cow.makeSound();


        Animal animal = new Animal("Animal", 5);
        animal.eat("de l'herbe");
        animal.eat();
    }
}
