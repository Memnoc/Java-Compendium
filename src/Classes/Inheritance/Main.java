package Classes.Inheritance;

public class Main {

    public static void main(String[] args) {

//        Animal animalOne = new Animal("Tiger", 1, 1, 3, 120);
//        System.out.println(animalOne.getName());

        Dog lucky = new Dog("Lucky", 5, 65, "bull terrier", "Fluffy", 1, 1);
//        lucky.eat();
        lucky.run();
        lucky.walk();

    }
}
