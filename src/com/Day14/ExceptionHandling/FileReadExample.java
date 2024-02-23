package com.Day14.ExceptionHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            // Attempt to read from a file
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and print each line of the file
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // Close the scanner
        scanner.close();
    }
}
