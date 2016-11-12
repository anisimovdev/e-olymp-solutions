import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger n = new BigInteger(new Scanner(System.in).next());
        int a = n.compareTo(BigInteger.ZERO);
        System.out.println((a < 0 ? -1 : 1) * (n.multiply(a < 0 ? n.subtract(BigInteger.ONE) : n.add(BigInteger.ONE)).shiftRight(1).longValue() - (a < 0 ? 1 : 0)));
    }
}
