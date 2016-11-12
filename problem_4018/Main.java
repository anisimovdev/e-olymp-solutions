import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), i = 0, j = 0;
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == 0 && j == 0) continue;
                if (i == 0) {
                    b[i][j] += b[i][j - 1];
                } else if (j == 0) {
                    b[i][j] += b[i - 1][j];
                } else {
                    if (b[i][j - 1] < b[i - 1][j]) {
                        b[i][j] += b[i][j - 1];
                    } else {
                        b[i][j] += b[i - 1][j];
                    }
                }
            }
        }
        System.out.println(b[n - 1][m - 1]);
    }
}
