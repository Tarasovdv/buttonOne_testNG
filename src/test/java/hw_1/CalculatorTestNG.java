package hw_1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestNG {
    @Test
    public void shouldHaveCorrectSum() {
        int result = Calculator.sum(3, 5);
        assertEquals(8, result);
    }
    @Test
    public void ShouldHaveCorrectionMult() {
        int result = Calculator.mult(3, 3);
        assertEquals(9, result);
    }

    @Test
    public void ShouldHaveCorrectionDiv() {
        int result = Calculator.div(3, 3);
        assertEquals(1, result);
    }

    @Test
    public void ShouldHaveCorrectionSubstract() {
        int result = Calculator.substract(3, 3);
        assertEquals(0, result);
    }

}
