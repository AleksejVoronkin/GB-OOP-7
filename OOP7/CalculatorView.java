package JAVA.OOP7;

public class CalculatorView {
        private final InputReader inputReader;

        public CalculatorView(InputReader inputReader) {
            this.inputReader = inputReader;
        }

        public void displayResult(ComplexNumber result) {
            System.out.println("Результат: " + result);
        }

        public ComplexNumber getNumberInput() {
            System.out.print("Введите действительную часть числа: ");
            double real = inputReader.readNumber();
            System.out.print("Введите мнимую часть числа: ");
            double imaginary = inputReader.readNumber();
            return new ComplexNumber(real, imaginary);
        }

        public Operation getOperationInput() {
            System.out.print("Введите операцию из этого списка -> +, *, /: ");
            char operation = inputReader.readOperation();
            switch (operation) {
                case '+':
                    return new Addition();
                case '*':
                    return new Multiplication();
                case '/':
                    return new Division();
            }
            throw new IllegalArgumentException("Неверная операция. Попробуйте снова.");
        }
    }
