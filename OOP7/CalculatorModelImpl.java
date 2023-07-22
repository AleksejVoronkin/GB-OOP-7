package JAVA.OOP7;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModelImpl implements CalculatorModel {
        private ComplexNumber result;
        private List<CalculatorObserver> observers = new ArrayList<>();

        @Override
        public void performOperation(ComplexNumber num1, ComplexNumber num2, Operation operation) {
            result = operation.calculate(num1, num2);
            notifyObservers(result);
        }

        @Override
        public ComplexNumber getResult() {
            return result;
        }

        private void notifyObservers(ComplexNumber result) {
            for (CalculatorObserver observer : observers) {
                observer.update(result);
            }
        }
}
