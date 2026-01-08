public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 5);


        System.out.println(animal.getPelage());

        Dog dog = new Dog("Rex", 3);
        dog.afficherInfos();
    }
}
