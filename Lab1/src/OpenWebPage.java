import java.net.*;
import java.io.*;

/**  This class provides a main function to read five lines of a company
 *   Web page and prints them in reverse order, given the name of a company.
 */

class OpenWebPage {

//   Prompts the user for the name X of a company (a single string), opens
//   the Web site corresponding to www.X.com, and prints the first five lines
//   of the Web page in reverse order.
    public static void main(String[] arg) throws Exception {

        BufferedReader keyoabrd;
        String inputLine;

        keyoabrd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        // Make sure the line is printed immediately.
        inputLine = keyoabrd.readLine();

        // YOUR CODE HERE

        URL webURL = new URL("https://www."+inputLine+".com/");
        BufferedReader html = new BufferedReader(new InputStreamReader(webURL.openStream()));
        String[] htmlLines = new String[5];

        for (int i = 0; i < 5; i++){    // Get first 5 lines of web page
            htmlLines[i] = html.readLine();
        }

        for (int i = 4; i >= 0; i--){   // Print lines in reverse order
            System.out.println(htmlLines[i]);
        }

        html.close();   // Close the input stream
    }
}