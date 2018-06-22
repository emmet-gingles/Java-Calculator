
import calculator.Calculator ;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCalculator {
    
    Calculator calc = new Calculator();
    
    // test for add function
    @Test
    public void testAdd(){
        double res = calc.add(2.5, 1.3);
        assertEquals(3.8, res, 0);
        double res2 = calc.add(-3.4, -1.5);
        assertEquals(-4.9, res2, 0);
        double res3 = calc.add(1.2, -0.3);
        assertEquals(0.9, res3, 0);
        double res4 = calc.add(-1.2, -0.31);
        assertEquals(-1.51, res4, 0);
    }
    
    // test for subtract function
    @Test
    public void testSubtract(){
        double res = calc.subtract(2.0, 1.0);
        assertEquals(1.0, res, 0);
        double res2 = calc.subtract(1.6, -2.7);
        assertEquals(4.3, res2, 0);
        double res3 = calc.subtract(-3.6, -5.2);
        assertEquals(1.6, res3, 0);
        double res4 = calc.subtract(-3.6, -5.24);
        assertEquals(1.64, res4, 0);
    }
    
    // test for multiply function
    @Test
    public void testMultiply(){
        double res = calc.multiply(2.0, 2.0);
        assertEquals(4.0, res, 0);
        double res2 = calc.multiply(2.0, 0.0);
        assertEquals(0.0, res2, 0);
        double res3 = calc.multiply(-2.0, 2.0);
        assertEquals(-4.0, res3, 0);
        double res4 = calc.multiply(-2.0, -2.0);
        assertEquals(4.0, res4, 0);
    }
    
    // test for divide function
    @Test
    public void testDivide(){
        double res = calc.divide(5.5, 2.0);
        assertEquals(2.75, res, 0);
        double res2 = calc.divide(2.0, 0.0);
        assertEquals(0.000, res2, 0);
        double res3 = calc.divide(5.5, -2.0);
        assertEquals(-2.75, res3, 0);
        double res4 = calc.divide(-5.5, -2.0);
        assertEquals(2.75, res4, 0);
    }
    
    // test for average function
    @Test
    public void testAverage(){
        double res = calc.average(5.0, 2.0);
        assertEquals(3.5, res, 0);
        double res2 = calc.average(5.0, -2.0);
        assertEquals(1.5, res2, 0);
        double res3 = calc.average(-5.0, -2.0);
        assertEquals(-3.5, res3, 0);
        double res4 = calc.average(5.0, 2.02);
        assertEquals(3.51, res4, 0);
    }
    
    // test for square root function
    @Test
    public void testSquareRoot(){
        double res = calc.squareRoot(144);
        assertEquals(12, res, 0);
        double res2 = calc.squareRoot(64);
        assertEquals(8, res2, 0);
        double res3 = calc.squareRoot(25);
        assertEquals(5, res3, 0);
    }
    
    // test for exponent function
    @Test
    public void testExponent(){
        double res = calc.exponent(3.0, 3.0);
        assertEquals(27.0, res, 0);
        double res2 = calc.exponent(5.0, 2.0);
        assertEquals(25.0, res2, 0);
        double res3 = calc.exponent(-5.0, 2.0);
        assertEquals(25.0, res3, 0);
        double res4 = calc.exponent(5.0, 0.0);
        assertEquals(1.0, res4, 0);
    }
    
    // test for factorial function
    @Test
    public void testFactorial(){
        int res = calc.factorial(3);
        assertEquals(6, res, 0);
        int res2 = calc.factorial(4);
        assertEquals(24, res2, 0);
        int res3 = calc.factorial(5);
        assertEquals(120, res3, 0);
        int res4 = calc.factorial(0);
        assertEquals(1, res4, 0);
        int res5 = calc.factorial(-3);
        assertEquals(-6, res5, 0);
    }
}
