import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {

    }

    public int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++)
        {
            if (A[j] <= x)
            {
                i += 1;
                swap(A, A[i], A[j]);
            }
        }
        swap(A, A[i+1], A[r]);
        return i + 1;
    }

    public void quicksort(int[] A, int p, int r) {
        int q;
        if(p < r)
        {
            q = partition(A, p, r);
            quicksort(A, p, q-1);
            quicksort(A, q+1, r);
        }
    }

    public void swap(int[] arr, int i, int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
