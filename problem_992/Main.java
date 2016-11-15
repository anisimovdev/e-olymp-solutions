import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        short count = 0;
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                if (sc.nextByte() == 1) count++;
            }
        }
        System.out.println(count / 2);
    }
}
