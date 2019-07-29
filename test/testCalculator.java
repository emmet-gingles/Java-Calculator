
import calculator.Calculator;                   /* Import Calcualtor class */
import java.util.ArrayList;                     /* Import arraylist */
import org.junit.Test;                          /* Import JUnit test */
import static org.junit.Assert.assertEquals;    /* Import Junit's assertEquals function */

/* TestCalculator class */
public class testCalculator {
    
    /* Instance of Calculator class */
    Calculator calc = new Calculator();
    /* Difference between expected and actual values in tests */
    double delta = 0.0;
    
    /* Test for Calculator's add function */
    @Test
    public void testAdd(){       
        assertEquals(2, calc.add(1, 1), delta);
        assertEquals(1, calc.add(2, -1), delta);
        assertEquals(-3, calc.add(-2, -1), delta);
        assertEquals(-4, calc.add(-2, -2), delta);
        assertEquals(5.22, calc.add(2.12, 3.1), delta);
    }
    
    /* Test for Calculator's subtract function */
    @Test
    public void testSubtract(){
        assertEquals(1, calc.subtract(2, 1), delta);
        assertEquals(3, calc.subtract(2, -1), delta);
        assertEquals(-1, calc.subtract(-2, -1), delta);
        assertEquals(0, calc.subtract(-2, -2), delta);
        assertEquals(-0.98, calc.subtract(2.12, 3.1), delta);
    }
    
    /* Test for Calculator's multiply function */
    @Test
    public void testMultiply(){
        assertEquals(4, calc.multiply(2, 2), delta);
        assertEquals(0, calc.multiply(1, 0), delta);
        assertEquals(4, calc.multiply(-2, -2), delta);
        assertEquals(-4, calc.multiply(-2, 2), delta);
        assertEquals(3.75, calc.multiply(2.5, 1.5), delta);
    }
    
    /* Test for Calculator's divide function */
    @Test
    public void testDivide(){
        assertEquals(2, calc.divide(2, 1), delta);
        assertEquals(0, calc.divide(1, 0), delta);
        assertEquals(1, calc.divide(-2, -2), delta);
        assertEquals(-1, calc.divide(-2, 2), delta);
        assertEquals(1.5, calc.divide(3.75, 2.5), delta);
    }
    
    /* Test for Calculator's modulus function */
    @Test
    public void testModulus(){
        assertEquals(0, calc.modulus(4, 2), delta);
        assertEquals(1, calc.modulus(3, 2), delta);
        assertEquals(.5, calc.modulus(2.5, 2), delta);
        assertEquals(2, calc.modulus(2, 0), delta);
    }
    
    /* Test for Calculator's average function */
    /* Before each test the arraylist is cleared and new numbers are added */
    @Test
    public void testAverage(){
        ArrayList <Double> nums = new ArrayList<>();
        nums.add(2.0); nums.add(2.0);
        assertEquals(2, calc.average(nums), delta);
        nums.clear();
        nums.add(2.0); nums.add(2.0); nums.add(3.0);
        assertEquals(2.33, calc.average(nums), delta);
        nums.clear();
        nums.add(-2.0); nums.add(-2.0);
        assertEquals(-2.0, calc.average(nums), delta);
    }
    
    /* Test for Calculator's square root function */
    @Test
    public void testSquareRoot(){
        assertEquals(5, calc.squareRoot(25), delta);
        assertEquals(10, calc.squareRoot(100), delta);
        assertEquals(0, calc.squareRoot(-1), delta);
    }
    
    /* Test for Calculator's power function */
    /* Any number to the power of 1 is itself */
    /* Any number to the power of 0 is 1 */
    /* If the exponent is negative then 1 is divided by the first number */
    @Test
    public void testPower(){
        assertEquals(4, calc.power(2, 2), delta);
        assertEquals(27, calc.power(3, 3), delta);
        assertEquals(2, calc.power(2, 1), delta);
        assertEquals(1, calc.power(2, 0), delta);
        assertEquals(.25, calc.power(2, -2), delta);
    }
    
    /* Test for Calculator's factorial function */
    @Test
    public void testFactorial(){
        assertEquals(1, calc.factorial(0), delta);
        assertEquals(2, calc.factorial(2), delta);
        assertEquals(6, calc.factorial(3), delta);
        assertEquals(24, calc.factorial(4), delta);
        assertEquals(-6, calc.factorial(-3), delta);
    }
}
