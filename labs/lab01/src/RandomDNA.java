import java.util.Random;

public class RandomDNA {

    public static void main(String args[])
    {
        String[] dnaStrand = {"A", "T", "C", "G"};
        String result = "";
        Random rnd = new Random();

        for (int i = 0; i < 20; i++)
        {
            int r = rnd.nextInt(4);
            result += dnaStrand[r];
        }
        System.out.println(result);
    }
}