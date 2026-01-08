public class Dog extends Animal {

    Dog(String nom, int age) {
        super(nom, age);
    }

    void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);

        System.out.println("Pelage : " + getPelage());
    }
}
