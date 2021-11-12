import java.util.*;

public class DFS {
    public static void stack(int[][] matrix, int n) {
        Stack<Integer> temp = new Stack<>();
        int m = 0;
        int x[] = new int[n];
        int y[] = new int[n];
        int z[] = new int[n];

        for (int j = 0; j < n; j++) {
            temp.push(j);
            while(!temp.empty()) {
                int p = temp.peek();
                if (x[p] == 0)
                    x[p] = ++m;
                if (z[p] >= matrix[p].length) {
                    temp.pop();
                    if(y[p] == 0)
                        y[p] = ++m;
                    continue;
                }
                if (x[matrix[p][z[p]]] == 0)
                    temp.push(matrix[p][z[p]]);
                z[p]++;
            }
        }
        for (int j = 0; j < n; j ++)
            System.out.println((j + 1) + " " + x[j] + " " + y[j]);
    }

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            matrix[a] = new int[b];
            for (int j = 0; j < b; j++)
                matrix[a][j] = sc.nextInt() - 1;
        }
        sc.close();
        stack(matrix, n);


    }

}

