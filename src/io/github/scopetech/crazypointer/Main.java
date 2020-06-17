package io.github.scopetech.crazypointer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String version = "1.1";
        System.out.println("CrazyPointer VM " + version + " is ready. Reading file...");
        Scanner sc = new Scanner(System.in);
        boolean isNotExit = true;
        Reader reader;
        try {
            reader = new FileReader(args[0]);
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            System.out.println("File in parameter is not found. Please enter the file:");
            try {
                reader = new FileReader(sc.nextLine());
            } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e1) {
                System.out.println("File in parameter is not found. Please enter the file:");
                reader = new FileReader(sc.nextLine());
            }
        }
        while (isNotExit) {
            char pointer = 0;
            int a;
            while ((a = reader.read()) != -1) {
                if ((char) a == '>') pointer++;
                else if ((char) a == '<') pointer--;
                else if ((char) a == '.') System.out.print(pointer);
            }
            System.out.println("\nThe file has been read successful! Do you want to exit this program?(y/n)");
            if (sc.nextLine().equalsIgnoreCase("y")) {
                isNotExit = false;
            } else {
                System.out.println("Please enter the file:");
                reader = new FileReader(sc.nextLine());
            }
        }
        System.out.println("Thanks for use!");
        reader.close();
        System.exit(0);
    }
}
