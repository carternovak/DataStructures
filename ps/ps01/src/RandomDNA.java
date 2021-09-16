import java.util.Random;

public class RandomDNA {

    public String generateDNAstring(int n)
    {
        String[] dnaStrand = {"A", "T", "C", "G"};
        String result = "";
        Random rnd = new Random();

        for (int i = 0; i < n; i++)
        {
            int r = rnd.nextInt(4);
            result += dnaStrand[r];
        }

        return result;
    }
    public static void main(String args[])
    {
        RandomDNA myRandomDNA = new RandomDNA();
        String myDNAstring = "";
        for (int x = 10; x <= 1000; x *= 10)
        {
            System.out.println("");
            myDNAstring = myRandomDNA.generateDNAstring(x);
            System.out.println("A DNA sequence " + x + " characters long: " + myDNAstring);
        }

    }
}