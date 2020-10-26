public class Duck {

   public void quack() {
      System.out.println("Quack!");
   }

   public void swim() {
      System.out.println("swimming...");
   }
}

class MallardDuck extends Duck {

   public void fly() {
      System.out.println("flying...");
   }
}

class RubberDuck extends Duck {

   @Override
   public void quack() {
      System.out.println("Squeak!");
   }
}
