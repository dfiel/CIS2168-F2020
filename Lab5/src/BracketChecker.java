import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BracketChecker {
    List<Character> openBrackets = Arrays.asList('[',  '{', '(');
    List<Character> closedBrackets = Arrays.asList(']',  '}', ')');
    // helper class to hold character and position
    static class Bracket {
        char bracket;
        int position;

        Bracket(char c, int p){
            this.bracket = c;
            this.position = p;
        }
    }

    public String matchBrackets(String input){
        Stack<Bracket> bracketStack = new Stack<>();
        StringCharacterIterator stringIterator = new StringCharacterIterator(input);
        Bracket tBracket = null;
        for (char sChar = stringIterator.first(); sChar != CharacterIterator.DONE; sChar = stringIterator.next()){
            if (!openBrackets.contains(sChar) && !closedBrackets.contains(sChar)) continue;
            if (bracketStack.isEmpty() && closedBrackets.contains(sChar)) return Integer.toString(stringIterator.getIndex());
            if (openBrackets.contains(sChar)){
                tBracket = new Bracket(sChar, stringIterator.getIndex()+1);
                bracketStack.push(tBracket);
            }
            if (closedBrackets.contains(sChar)){
                tBracket = bracketStack.pop();
                if (tBracket.bracket == '[' && sChar == ']') continue;
                if (tBracket.bracket == '{' && sChar == '}') continue;
                if (tBracket.bracket == '(' && sChar == ')') continue;
                return Integer.toString(stringIterator.getIndex()+1);
            }
        }
        if (!bracketStack.isEmpty()) {
            while (!bracketStack.isEmpty()) tBracket = bracketStack.pop();
            return Integer.toString(tBracket.position);
        }
        return "Success";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BracketChecker bc = new BracketChecker();
        System.out.println("Enter your expression: ");
        String inputText = input.nextLine();
        long startTime = System.currentTimeMillis();
        String outputText = bc.matchBrackets(inputText);
        long finishTime = System.currentTimeMillis();
        System.out.println("Result: "+ outputText);
        System.out.println("Calculation Time: " + (finishTime-startTime) + " milliseconds");
        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory Usage: " + memory + " bytes");
    }
}
