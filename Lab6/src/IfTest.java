public class IfTest {
    public static void main(String[] args) {
        int n = 10;
        int ifcount = 0;

        for (int r = 0; r <= n;  r++){
            for (int i = 0; i < r; i++) {
                for (int j = i + 1; j < r; j++) {
                    ifcount++;
                }
            }
            System.out.println("Sample Size: "+r);
            System.out.println("Execution Number: "+ifcount);
            System.out.println();
            ifcount = 0;
        }

    }
}
