package JAVA.OOP7;

public interface CalculatorModel {
        void performOperation(ComplexNumber num1, ComplexNumber num2, Operation operation);
        ComplexNumber getResult();
        
    }