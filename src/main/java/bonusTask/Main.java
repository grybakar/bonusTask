package bonusTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String PATH = "src/main/resources/strings.txt";


    public static void main(String[] args) {


        StringBuilder string = new StringBuilder();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(PATH));
            String line = reader.readLine();

            int numberSum;

            while (line != null) {

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    boolean isDigit = Character.isDigit(ch);
                    if (isDigit) {
                        string.append(ch);
                        numberSum = Integer.parseInt(String.valueOf(string));

                        if (numberSum >= 10) {
                            System.out.println(line);
                            break;
                        }
                    } else {
                        string.setLength(0);
                    }
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

