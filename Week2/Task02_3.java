package Week2;

import java.io.*;
import java.util.*;

public class Task02_3 {

    public static void main(String[] args) {
        String fileName = "resources/T02_score.txt";
        Map<String, Integer> examMarks = new HashMap<>();
        loadExistingMarks(fileName, examMarks);

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter student name (first name only) or 'x' to quit: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            System.out.print("Enter exam mark for " + input + ": ");
            int mark = scanner.nextInt();
            scanner.nextLine();

            if (examMarks.containsKey(input)) {
                System.out.print("The record already exists. Do you want to overwrite it? (Y/N): ");
                String overwriteInput = scanner.nextLine();
                if (overwriteInput.equalsIgnoreCase("Y")) {
                    examMarks.put(input, mark);
                    System.out.println("Record updated successfully.");
                } else {
                    System.out.println("Record not overwritten. Continuing to next input.");
                }
            } else {
                examMarks.put(input, mark);
                System.out.println("Record added successfully.");
            }
        }

        saveExamMarks(fileName, examMarks);
        System.out.println("Program completed successfully.");
    }

    private static void loadExistingMarks(String fileName, Map<String, Integer> examMarks) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int mark = Integer.parseInt(parts[1].trim());
                    examMarks.put(name, mark);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. A new file will be created.");
        }
    }

    private static void saveExamMarks(String fileName, Map<String, Integer> examMarks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : examMarks.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error occurred while saving exam marks: " + e.getMessage());
        }
    }
}

