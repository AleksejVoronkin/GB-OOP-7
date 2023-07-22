package JAVA.OOP7;

 public class Addition implements Operation {
        @Override
        public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
            double real = num1.getReal() + num2.getReal();
            double imaginary = num1.getImaginary() + num2.getImaginary();
            return new ComplexNumber(real, imaginary);
        }
    }
