package Classes.Inheritance;

public class Dog extends Animal {

    private String breed;
    private String coat;
    private int eyes;
    private int legs;
    private int tail;


    public Dog(String name, int size, int weight, String breed, String coat, int eyes, int tail) {
        super(name, 1, 1, size, weight);
        this.breed = breed;
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
    }

    private void bark() {
        System.out.println("Dog.bark() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        bark();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() has been called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() has been called");
        super.move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        super.move(speed);
    }
}
