import data.ComplexNum;
import service.Addition;
import service.ComplexNumCalculator;
import service.Devision;
import service.Multiplication;
import view.ConsoleView;

public class App {
    public static void main(String[] args) {
            ComplexNum num1 = new ComplexNum(12D, -2D);
            ComplexNum num2 = new ComplexNum(10D, 3D);

            System.out.println(num1);
            System.out.println(num2);

            ComplexNumCalculator myCNC = new ComplexNumCalculator(new ConsoleView());

            myCNC.Сalculate( new Addition(), num1, num2);
            myCNC.Сalculate( new Multiplication(), num1, num2);
            myCNC.Сalculate( new Devision(), num1, num2);
    }
}
