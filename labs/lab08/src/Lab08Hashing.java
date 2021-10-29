import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab08Hashing {
    public static String[] words;
    public static Map<String, ArrayList<Integer>> doc = new HashMap<String, ArrayList<Integer>>();

    public static void main(String[] args) throws IOException {
        File txtFile = new File("\\Users\\novak\\Documents\\GitHub\\C343novakc\\labs\\lab08\\src\\lab08text.txt");
        Scanner sc = new Scanner(new FileReader(txtFile));
        int lineNum = 1;

        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            words = line.split(" ");

            for (String word: words)
            {
                if (!doc.containsKey(word))
                {
                    ArrayList<Integer> lineNumTracker = new ArrayList<>();
                    lineNumTracker.add(lineNum);
                    doc.put(word, lineNumTracker);
                }
                else
                {
                    doc.get(word).add(lineNum);
                }
            }
            lineNum++;
        }

        sc.close();
        search("data");
        search("algorithm");
    }

    public static void search(String word) {
        System.out.println(doc.get(word));
    }

}
