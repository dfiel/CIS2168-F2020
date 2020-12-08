import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PhoneBook {

    private final FastScanner in = new FastScanner();
    // Keep list of all existing (i.e. not deleted yet) contacts.
    private final String[] contacts = new String[10000000];

    public static void main(String[] args) {
        // start timer
        final long startTime = System.currentTimeMillis();

        // process the queries
        new PhoneBook().processQueries();

        // end the timer and print the result
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime)/1000F + " seconds.");
        System.out.println("Memory Usage: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000F + " MB");
    }

    private Query readQuery() {
        String type = in.next();
        int number = in.nextInt();
        if (type.equals("add")) {
            String name = in.next();
            return new Query(type, name, number);
        } else {
            return new Query(type, number);
        }
    }

    private void writeResponse(String response) {
        System.out.println(response);
    }


    private void processQuery(Query query) {
        if (query.type.equals("add")) {
            contacts[query.number] = query.name;
        } else if (query.type.equals("del")) {
            contacts[query.number] = null;
        } else {
            if (contacts[query.number] != null) writeResponse(contacts[query.number]);
            else writeResponse("not found");
        }
    }

    public void processQueries() {
        int queryCount = in.nextInt();
        for (int i = 0; i < queryCount; ++i)
            processQuery(readQuery());
    }

    static class Query {
        String type;
        String name;
        int number;

        public Query(String type, String name, int number) {
            this.type = type;
            this.name = name;
            this.number = number;
        }

        public Query(String type, int number) {
            this.type = type;
            this.number = number;
        }
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
