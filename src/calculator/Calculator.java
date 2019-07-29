
package calculator;
import java.util.ArrayList;       /* Import arraylist */


public class Calculator {
    
    /* Function that adds two numbers */
    public double add(double num1, double num2){
        /* Count the number of decimal places for each input parameter */
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        /* Find the higher number of decimal places */
        int numPlaces = Math.max(n1, n2);  
        /* Add the two parameter, formated as a string with the greater number 
            of decimal places 
        */
        String s = String.format("%."+numPlaces+"f", num1 + num2);
        /* Parse string to a double and return it */
        return Double.parseDouble(s);      
    }
    
    /* Function that subtracts two numbers */
    public double subtract(double num1, double num2){
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        int numPlaces = Math.max(n1, n2); 
        String s = String.format("%."+numPlaces+"f", num1 - num2);
        return Double.parseDouble(s); 
    }
    
    /* Function that multiplies two numbers */
    public double multiply(double num1, double num2){
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        int numPlaces = n1 + n2; 
        String s = String.format("%."+numPlaces+"f", num1 * num2);
        return Double.parseDouble(s);
    }
    
    /* Function that divides two numbers */
    public double divide(double num1, double num2){
        /* If we divide by zero it gives an error, this is to safeguard this */
        if (num1 == 0 || num2 == 0){
            return 0.0;
        }
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        int numPlaces = n1 + n2; 
        String s = String.format("%."+numPlaces+"f", num1/num2);
        return Double.parseDouble(s); 
    }
    
    /* Function that returns the remainder of the division of two numbers */
    public double modulus(double num1, double num2){
        /* Call the divide function and floor the result to make it a 
           whole number 
        */
        double div = Math.floor(this.divide(num1, num2));
        /* Multiply the result by the second number and subtract this from the 
           first number 
        */
        return this.subtract(num1, this.multiply(div, num2));
    }
    
    /* Function that returns the average of a set of numbers */
    public double average(ArrayList<Double> nums){
        /* Initialize variable as zero */
        int total = 0;
        /* Loop through each number and increase the total accordingly */
        for(int i=0;i< nums.size();i++){
            total += nums.get(i);
        }
        /* Divide the total by the number of numbers */
        return this.divide(total, nums.size());
    }
    
    /* Function that returns the square root of a number */
    public double squareRoot(int num){
        /* Check that number is greater than zero */
        if(num <= 0){
            return 0.0;
        }
        /* Call the Maths square root function */
        return Math.sqrt(num);
    }
    
    /* Function that returns a number to the power of an exponent */
    public double power(double num, int power){
        return Math.pow(num, power);
    }
    
    /* Function that returns the factorial of a number */
    public int factorial(int num){
        /* Intialize variable as 1 */
        int fact = 1;
        /* 0! = 1 */
        if (num == 0){
            return 1;
        }        
        /* If number is positive loop through each number from 1 up to the number */
        if (num > 0){
            for(int i=1;i <= num;i++){
                fact = fact * i;
            }
        }
        /* If number is negative loop through each number from -1 up to the number */
        else{
            for(int i=-1;i >= num;i--){
                fact = fact * i;
            }
        }
        return fact;
    }

}
