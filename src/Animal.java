public class Animal {
    private String pelage;
    protected String nom;
    public int age;

    Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.pelage  = "Inconnu";
    }

    static void communeRule() {
        System.out.println("Tous les animaux doivent manger pour vivre.");

    }

    void eat() {
        System.out.println("L'animal mange.");
    }

    void eat(String nourriture) {
        System.out.println("L'animal mange " + nourriture + ".");
    }


    public void makeSound() {
        System.out.println("L'animal fait un son.");
    }

    public String getPelage() {
        return pelage;
    }
}


