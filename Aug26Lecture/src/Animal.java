abstract class Animal {
    String name = "???";
    public abstract void feed();
    public void printName() {
        System.out.println(name);
    }
}

class Cow extends Animal {
    public void feed() { addHay(); }
    private void addHay() {
        System.out.println("Hay is good for me!");
    }
}

class Bird extends Animal {
    public void feed() { addSeed(); }
    private void addSeed() {
        System.out.println("sunflower seeds, please!");
    }
}

class Lion extends Animal {
    String name = "Leo";
    public void feed() { addMeat(); }
    private void addMeat() {
        System.out.println("Toss in meat! Quick!");
    }
}

