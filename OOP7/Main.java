package JAVA.OOP7;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModelImpl();
        CalculatorView view = new CalculatorView(new InputReader());
        CalculatorPresenter presenter = new CalculatorPresenter(model, view, new ConsoleLogger());
        presenter.performOperation();
        }
}

