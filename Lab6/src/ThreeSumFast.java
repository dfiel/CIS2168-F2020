import java.util.Arrays;

public class ThreeSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (BinarySearch.indexOf(a, -(a[i]+a[j])) > j)
                    count++;
        return count;
    }

    public static void main(String[] args) {
        In in = new In("16Kints.txt");
        int[] a = in.readAllInts();
        long startTime = System.currentTimeMillis();
        System.out.println("Count is: "+count(a));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time (ms): "+(endTime-startTime));
    }
}
