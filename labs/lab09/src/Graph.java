import java.util.Scanner;

public class Graph {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = new int[n][n];

        for (int i = 0; i < n; i ++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();

            for (int j = 0; j < b; j ++)
                result[a][sc.nextInt() - 1] = 1;
        }
        sc.close();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - 1; j++)
                System.out.print(result[i][j] + " ");
            System.out.println(result[i][n - 1]);
        }
    }
}