package io.github.scopetech.crazypointer;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * @author squid233
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) { }
        String version = "1.2";
        System.out.println("CrazyPointer VM " + version + " is ready. Reading file...");
        Scanner sc = new Scanner(System.in);
        Reader r = null;
        try {
            r = new FileReader(args[0]);
        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            System.out.println("File in parameter is not found. Please enter the file:");
            try {
                r = new FileReader(sc.nextLine());
            } catch (FileNotFoundException ee) {
                JOptionPane.showMessageDialog(null,
                        "Error: Could not create the Java Virtual Machine.\nError: A fatal exception has occurred. Program will exit.",
                        "Java Virtual Machine Launcher", JOptionPane.ERROR_MESSAGE);
                System.exit(-1);
            }
        }
        while (true) {
            char c = 0;
            int ptr = 0;
            while (true) {
                try {
                    if ((ptr = r.read()) == -1) {
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                char ptrC = (char) ptr;
                if (ptrC == '>') {
                    c++;
                } else if (ptrC == '<') {
                    c--;
                } else if (ptrC == '.') {
                    System.out.print(c);
                }
            }
            System.out.println("\nThe file has been read successful! Do you want to exit this program?(y/n)");
            if ("y".equalsIgnoreCase(sc.nextLine())) {
                System.out.println("Thanks for use!");
                System.exit(0);
            } else {
                System.out.println("Please enter the file:");
                try {
                    r = new FileReader(sc.nextLine());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thanks for use!");
        }
    }
}
