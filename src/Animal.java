public class Animal {

    String nom;
    int age;

    Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    static void communeRule() {
        System.out.println("Tous les animaux doivent manger pour vivre.");
    }

    public void makeSound() {
        System.out.println("L'animal fait un son.");
    }
}

