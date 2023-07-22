package JAVA.OOP7;

import java.util.Scanner;

public class InputReader {
        private final Scanner scanner;

        public InputReader() {
            scanner = new Scanner(System.in);
        }

        public double readNumber() {
            String input = scanner.nextLine();
            return Double.parseDouble(input);
        }

        public char readOperation() {
            String input = scanner.nextLine();
            return input.charAt(0);
        }
    }
