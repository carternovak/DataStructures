import java.util.Scanner;

public class MergeSort {

    static int operations = 0;

    public static void merge(int[] array, int left, int mid, int right) {

        int n1 = mid - left;
        int n2 = right - mid;
        int[] leftArray = new int[n1 + 1];
        int[] rightArray = new int[n2 + 1];

        for (int i = 0; i <= n1 - 1; i++)
            leftArray[i] = array[left + i];

        for (int i = 0; i <= n2 - 1; i++)
            rightArray[i] = array[mid + i];

        leftArray[n1] = Integer.MAX_VALUE;
        rightArray[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = left; k <= right - 1; k++) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            operations++;
        }

    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid, right);
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numInt = sc.nextInt();
        int[] array = new int[numInt];

        for (int i = 0; i < numInt; i++)
        {
            array[i] = sc.nextInt();
        }
        mergeSort(array, 0, numInt);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numInt; i++)
        {
            if (i > 0)
                result.append(" ");

            result.append(array[i]);
        }
        sc.close();
        System.out.println(result);
        System.out.println(operations);
    }
}
