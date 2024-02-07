public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Generic Animal","Medium",300.00);
//        doAnimalStuff(animal,"slow");

        Dog dog = new Dog("Blackie",16,"round","curved");
        doAnimalStuff(dog,"fast");
        dog.toString();
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        animal.animalDetails();
    }
}
