package JAVA.OOP7;

public class CalculatorPresenter {
        private final CalculatorModel model;
        private final CalculatorView view;
        private final Logger logger;

        public CalculatorPresenter(CalculatorModel model, CalculatorView view, Logger logger) {
            this.model = model;
            this.view = view;
            this.logger = logger;
        }

        public void performOperation() {
            ComplexNumber num1 = view.getNumberInput();
            Operation operation = view.getOperationInput();
            ComplexNumber num2 = view.getNumberInput();

            try {
                model.performOperation(num1, num2, operation);
                logger.logInfo("Выполнена операция: " + num1 + " " + operation.getClass().getSimpleName() + " " + num2);
            } catch (IllegalArgumentException e) {
                logger.logError("Ошибка: " + e.getMessage());
                return;
            }

            view.displayResult(model.getResult());
        }
    }
