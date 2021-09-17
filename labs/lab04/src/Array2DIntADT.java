import java.util.NoSuchElementException;

public interface Array2DIntADT {

    public void set(int a, int posX, int posY);

    public int get(int posX, int posY);

    public int[][] setElementsToZero();

    public void rowSet(int[] arr, int row);

    public int[] rowGet(int row);

    public void columnSet(int[] arr, int col);

    public int[] columnGet(int col);


}
