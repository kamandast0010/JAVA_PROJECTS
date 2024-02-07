public class Main{
    //this is main class dealing with question 4 Animal class and the cat class
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.sound = "woof woof";
        dog.makeSound();

        Cat fluffy = new Cat();
        fluffy.sound = "meeoowwwwww";
        fluffy.makeSound();
    }
}
