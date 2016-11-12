import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] a = new long[n][m];
        a[n - 1][0] = 1;
        for (int i = n - 1; i > -1; i--) {
            for (int j = 0; j < m; j++) {
                if (i == n - 1 && j == 0) continue;
                a[i][j] = (i < n - 1 ? a[i + 1][j] : 0) + (j > 0 ? a[i][j - 1] : 0);
            }
        }
        System.out.println(a[0][m - 1]);
    }
}
