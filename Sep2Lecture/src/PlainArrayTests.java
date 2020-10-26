import java.util.Arrays;

public class PlainArrayTests {
    public static void main(String[] args) {
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        int[] copiedSmallPrimes = Arrays.copyOf(smallPrimes, smallPrimes.length);
        int[] luckyNumbers = smallPrimes;

        System.out.println(Arrays.toString(smallPrimes));
        System.out.println(Arrays.toString(luckyNumbers));

        luckyNumbers[5] = 12;

        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println("now small primes are "+Arrays.toString(smallPrimes));

        System.out.println(Arrays.toString(copiedSmallPrimes));
    }
}
