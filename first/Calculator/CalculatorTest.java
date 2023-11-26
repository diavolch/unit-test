package seminars.first.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        assert 900 == Calculator.calculatingDiscount(1000, 10);
        assert 297 == Calculator.calculatingDiscount(300, 1);
        assert 425 == Calculator.calculatingDiscount(500, 15);
        assert 752 == Calculator.calculatingDiscount(800, 6);
    }
}