package JAVA.OOP7;

public class Division implements Operation {
        @Override
        public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
            double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
            if (denominator != 0) {
                double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
                double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
                return new ComplexNumber(real, imaginary);
            } else {
                throw new IllegalArgumentException("ДЕЛИТЬ НА 0 НЕЛЬЗЯ");
            }
        }
    }
