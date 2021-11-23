import java.util.*;
import java.lang.*;

public class MSTPrims {

    public void totalMSTWeight(int parent[], int graph[][], int numV)
    {
        int result = 0;
        for (int i = 1; i < numV; i++)
            result += graph[i][parent[i]];
        System.out.println(result);
    }

    public void prims(int matrix[][], int numV)
    {
        int parents[] = new int[numV];
        int weights[] = new int[numV];
        Boolean mstVertPair[] = new Boolean[numV];

        for (int i = 0; i < numV; i++) {
            weights[i] = Integer.MAX_VALUE;
            mstVertPair[i] = false;
        }

        weights[0] = 0;
        parents[0] = -1;

        for (int j = 0; j < numV - 1; j++) {
            int u = shortestPath(weights, mstVertPair, numV);
            mstVertPair[u] = true;

            for (int a = 0; a < numV; a++) {
                if (matrix[u][a] != 0 && mstVertPair[a] == false && matrix[u][a] < weights[a]) {
                    parents[a] = u;
                    weights[a] = matrix[u][a];
                }
            }
        }
        totalMSTWeight(parents, matrix, numV);
    }

    public int shortestPath(int weights[], Boolean mstVertPair[], int numV)
    {
        int D = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < numV; i++) {
            if (mstVertPair[i] == false && D > weights[i]) {
                D = weights[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        MSTPrims test = new MSTPrims();
        Scanner sc = new Scanner(System.in);
        int numVertex = sc.nextInt();
        int adjMatrix[][] = new int[numVertex][numVertex];

        for (int i = 0; i < numVertex; i++) {
            for (int j = 0; j < numVertex; j++) {
                adjMatrix[i][j] = Integer.parseInt(sc.next());
                if (adjMatrix[i][j] == -1)
                    adjMatrix[i][j] = 0;
            }
        }
        test.prims(adjMatrix, numVertex);
    }
}