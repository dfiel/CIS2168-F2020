import java.util.*;

public class Lottery {
   public static final int NUMBERS = 6;
   public static final int MAX_NUMBER = 40;
   public static final int PRIZE = 100;

   public static void main(String[] args) {
      // get winning number and ticket sets
      Set<Integer> winning = createWinningNumbers();
      Set<Integer> ticket = getTicket();
      System.out.println();

      // keep only winning numbers from the player's ticket
      Set<Integer> match = new TreeSet<>(ticket);
      match.retainAll(winning);


      // print results
      System.out.println("Your ticket was: " + ticket);
      System.out.println("Winning numbers: " + winning);
      // YOUR CODE BELOW
      // if there are any winning numbers, the do the following:
      //   1) compute the prize: double prize = PRIZE * Math.pow(2, matches.size());
      //   2) print the numbers that matched
      //   3) print the prize amount, if any.
      double prize = PRIZE * Math.pow(2, match.size());
      System.out.println("Matching Numbers: " + match);
      if (match.size() > 0) System.out.println("Prize Money: $" + prize);

   }

   // generates a set of the winning lotto numbers
   public static Set<Integer> createWinningNumbers() {
      // YOUR CODE BELOW:
      Set<Integer> winning = new TreeSet<>();
      Random r = new Random();
      while (winning.size() < NUMBERS) {
         int num = r.nextInt(MAX_NUMBER)+1;
         winning.add(num);
      }
      return winning; // <- CHANGE THIS LINE TO A CORRECT ONE
   }

   // reads the player's lottery ticket from the console
   public static Set<Integer> getTicket() {
      Set<Integer> ticket = new TreeSet<>();
      Scanner console = new Scanner(System.in);
      System.out.print("Type " + NUMBERS + " lotto numbers: ");
      while (ticket.size() < NUMBERS) {
         int number = console.nextInt();
         ticket.add(number);
      }
      return ticket;
   }
}
