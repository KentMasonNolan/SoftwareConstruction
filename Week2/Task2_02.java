package Week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_02 {

    public static void main(String[] args) {
        String inputFileName = "T02_input.txt";
        String outputFileName = "T02_output.txt";

        try {
            FileReader fileReader = new FileReader(inputFileName);
            FileWriter fileWriter = new FileWriter(outputFileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String processedLine = processLine(line);
                bufferedWriter.write(processedLine);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Task completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String processLine(String line) {
        StringBuilder sb = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
