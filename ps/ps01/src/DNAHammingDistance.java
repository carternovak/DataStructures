

public class DNAHammingDistance extends RandomDNA{

    public static int computeHamming(String a, String b)
    {
        int counter = 0;
        if (a.length() == b.length())
        {
            for (int i = 0; i <= a.length() - 1; i++)
            {
                if (a.charAt(i) != b.charAt(i))
                    counter++;
            }
        }
        return counter;
    }

    public static void main(String args[])
    {
        RandomDNA myRandomDNA = new RandomDNA();
        String firstDNA = "";
        String secondDNA = "";
        int hamming;
        for (int x = 100; x <= 1000; x *= 2)
        {
            System.out.println("");
            firstDNA = myRandomDNA.generateDNAstring(x);
            secondDNA = myRandomDNA.generateDNAstring(x);
            hamming = computeHamming(firstDNA, secondDNA);
            System.out.println(x + " characters long with a hamming distance of " + hamming);
            //System.out.println("a DNA sequence " + x + " characters long: " + firstDNA);
        }
    }
}
