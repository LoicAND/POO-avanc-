public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Marguerite", 4);

        System.out.println("Nom de l'animal : " + cow.nom);
        cow.makeSound();
    }
}
