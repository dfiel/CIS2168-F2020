import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        // Find the sum of the double values contained in the file fewDoubles.txt
        Scanner sc = new Scanner(new File("fewDoubles.txt"));
        double total = 0;
        while (sc.hasNextDouble()) {
            total += sc.nextDouble();
        }
        System.out.println("\nThe sum is "+total);
    }
}
