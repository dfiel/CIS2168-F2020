import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestJavaSet {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File("mobydick.txt"));
        while(in.hasNext()) {
            String word  = in.next().toLowerCase();
            words.add(word);
        }
        System.out.println(words.size());
    }
}
