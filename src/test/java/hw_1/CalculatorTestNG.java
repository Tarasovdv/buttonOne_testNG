package hw_1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestNG {
    @Test
    public void shouldHaveCorrectSum() {
        assertEquals(8, Calculator.sum(3, 5));
    }
    @Test
    public void shouldHaveCorrectionMultiply() {
        assertEquals(9, Calculator.multiply(3, 3));
    }

    @Test
    public void shouldHaveCorrectionDivision() {
        assertEquals(1, Calculator.division(3, 3));
    }

    @Test
    public void shouldHaveCorrectionSubstract() {
        assertEquals(0, Calculator.substract(3, 3));
    }
}
