import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        readFromFile("resource/money.txt");
    }

    public static void readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line=br.readLine())!=null) {
                if (Regex.checkValue(line))
                    System.out.println(line + " - yes");
                else
                    System.out.println(line + " - no");
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}

