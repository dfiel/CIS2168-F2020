public class Duck {
    // instance variables
    private int age = 2;
    private String name;

    // one-argument constructor
    public Duck(String name) {
        this.name = name;
    }

    // other methods
    public void makeSound() {
        System.out.println("Quack!");
    }

    public void sayHello() {
        System.out.println("I'm " + this.name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // main() tests the Duck data type
    public static void main(String[] args) {
        Duck duck = new Duck("Daffy");

        System.out.println("Our Duck's Name Is: " + duck.getName()); // Verify Duck's name using getter method

        duck.sayHello();  // prints "I'm Daffy"
        duck.makeSound(); // prints "Quack!"
    }
}