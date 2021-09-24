import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Array2DInt implements Array2DIntADT {

    private int[][] array2D;
    private int rowNum;
    private int colNum;

    public Array2DInt(int rowNum, int colNum)
    {
        array2D = new int[rowNum][colNum];
        this.rowNum = rowNum;
        this.colNum = colNum;
    }

    public void set(int a, int posX, int posY) {
        array2D[posX][posY] = a;
    }

    public int get(int posX, int posY) {
        return array2D[posX][posY];
    }

    public int[][] setElementsToZero() {
        for(int i = 0; i < array2D.length; i++)
        {
            for(int j = 0; j < array2D[i].length; j++)
            {
                array2D[i][j] = 0;
            }
        }
        return array2D;
    }

    public void rowSet(int[] arr, int row) {
        for (int i = 0; i < array2D.length; i++)
        {
            array2D[row][i] = arr[i];
        }
    }

    public int[] rowGet(int row) {
        int[] temp = new int[array2D[0].length];
        for(int i = 0; i < array2D[0].length; i++)
        {
            temp[i] = array2D[row][i];
        }
        return temp;
    }

    public void columnSet(int[] arr, int col) {
        for (int i = 0; i < array2D.length; i++)
        {
            array2D[i][col] = arr[i];
        }
    }

    public int[] columnGet(int col) {
        int[] temp = new int[array2D.length];
        for(int i = 0; i < array2D.length; i++)
        {
            temp[i] = array2D[i][col];
        }
        return temp;
    }

    public void toString2D() {
        System.out.println(Arrays.deepToString(array2D));
    }

    public void toString1D(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 6, 2, 6, 7, 8};
        System.out.println("----------------------");
        System.out.println("Method Test 1");

        Array2DInt testArr = new Array2DInt(6,6);
        testArr.set(20, 3, 4);
        testArr.set(39, 1, 2);
        System.out.println(testArr.get(3,4));
        testArr.toString2D();
        testArr.rowSet(arr1, 2);
        testArr.toString1D(testArr.rowGet(2));
        testArr.toString2D();
        testArr.columnSet(arr2, 3);
        testArr.toString1D(testArr.columnGet(3));
        testArr.toString2D();
        testArr.setElementsToZero();
        testArr.toString2D();

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr4 = {4, 6, 2, 6, 7, 8, 9, 0};
        System.out.println("----------------------");
        System.out.println("Method Test 2");

        Array2DInt testArr2 = new Array2DInt(8,8);
        testArr2.set(35, 2, 0);
        testArr2.set(68, 4, 5);
        System.out.println(testArr2.get(4,5));
        testArr2.toString2D();
        testArr2.rowSet(arr3, 7);
        testArr2.toString1D(testArr2.rowGet(7));
        testArr2.toString2D();
        testArr2.columnSet(arr4, 7);
        testArr2.toString1D(testArr2.columnGet(7));
        testArr2.toString2D();
        testArr2.setElementsToZero();
        testArr2.toString2D();

        int[] arr5 = {8, 6, 4, 2, 5};
        int[] arr6 = {7, 1, 2, 6, 7};
        System.out.println("----------------------");
        System.out.println("Method Test 3");

        Array2DInt testArr3 = new Array2DInt(4,4);
        testArr3.set(42, 2, 0);
        testArr3.set(13, 3, 2);
        System.out.println(testArr3.get(2,0));
        testArr3.toString2D();
        testArr3.rowSet(arr5, 3);
        testArr3.toString1D(testArr3.rowGet(3));
        testArr3.toString2D();
        testArr3.columnSet(arr6, 3);
        testArr3.toString1D(testArr3.columnGet(3));
        testArr3.toString2D();
        testArr3.setElementsToZero();
        testArr3.toString2D();


    }

}
