import java.math.BigInteger;

public class Big {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            BigInteger iBig = BigInteger.valueOf(i);
            result = result.multiply(iBig);
        }
        return result;
    }

    public static void display(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d \t %d %n", i, factorial(i));
        }
    }

    public static void main(String[] args) {
        display(30);
    }
}