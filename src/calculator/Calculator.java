
package calculator;
import java.util.Scanner;

public class Calculator {

    // function to add two numbers
    public double add(double num1, double num2){
        // count the number of decimal places for each input parameter
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        // find the higher number of decimal places
        int numPlaces = Math.max(n1, n2);  
        // add the two parameter, formated as a string with the greater number of decimal places
        String s = String.format("%."+numPlaces+"f", num1 + num2);
        // parse string to a double
        Double d = Double.parseDouble(s);
        return d;      
    }
    
    // function to subtract two numbers
    public double subtract(double num1, double num2){
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        int numPlaces = Math.max(n1, n2); 
        String s = String.format("%."+numPlaces+"f", num1 - num2);
        Double d = Double.parseDouble(s);
        return d; 
    }
    
    // function to multiply two numbers
    public double multiply(double num1, double num2){
        int n1 = String.valueOf(num1).split("\\.")[1].length();
        int n2 = String.valueOf(num2).split("\\.")[1].length();
        int numPlaces = n1 + n2; 
        String s = String.format("%."+numPlaces+"f", num1 * num2);
        Double d = Double.parseDouble(s);
        return d;
    }
    
    // function to divide two numbers
    public double divide(double num1, double num2){
        // if we divide by zero it gives an error, this is to safeguard this
        if (num1 == 0 || num2 == 0){
            return 0000.0;
        }
        else{
            int n1 = String.valueOf(num1).split("\\.")[1].length();
            int n2 = String.valueOf(num2).split("\\.")[1].length();
            int numPlaces = n1 + n2; 
            String s = String.format("%."+numPlaces+"f", num1/num2);
            Double d = Double.parseDouble(s);
            return d; 
        }
    }
    
    // function to get the average of two numbers
    public double average(double num1, double num2){
        return Calculator.this.add(num1, num2)/2.0;
    }
    
    // function to get the square root of a number
    public double squareRoot(int num){
        return Math.sqrt(num);
    }
    
    // function to calculate a number to the power of an exponent
    public double exponent(double num, double power){
        return Math.pow(num, power);
    }
    
    // function to calculate the factorial of a number
    public int factorial(int num){
        // 0! = 1
        if (num == 0){
            return 1;
        }
        int fact = 1;
        // if num is greater than 0 then loop through numbers until you get to num
        if (num > 0){
            for(int i=1;i <= num;i++){
                fact = fact * i;
            }
        }
        // if num is less than 0 then loop through numbers until you get to num
        else{
            for(int i=-1;i >= num;i--){
                fact = fact * i;
            }
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num;                            // for integer inputs
        double numInput1;                   // for double inputs
        double numInput2;                   // for double inputs
        String message = "Calculator \n Menu \n Type 1 for addition. Type 2 for subtraction."
                + "\n Type 3 for multiplication. Type 4 for division."
                + "\n Type 5 for average. Type 6 for squre root."
                + "\n Type 7 for exponent. Type 8 for factorial."
                + "\n Type 0 to exit program. \n";
        System.out.print(message);
        // continuous loop unless break is applied
        while(true){
                System.out.println("Enter choice");
                System.out.println("Type m for menu");
                // read the user input
                String input = sc.next();
                // if user enters 'm' then show menu
                if(input.equals("m")){
                    System.out.println(message);
                }
                // else input should be a number
                else{
                    try{
                        num = Integer.parseInt(input);
                        // exit the program if input is 0
                        if(num == 0){
                            break;
                        }
                        if(num < 1 || num > 8){
                            System.out.println("Please enter a number between 1 and 8");
                        }
                        else{
                            input = null;
                            // depending on the number entered, a different mathematical function is applied
                            switch(num){
                                case 1:
                                    System.out.println("Addition");
                                    System.out.println("Type c to cancel");
                                    // infinite loop unless break is applied
                                    while(true){
                                        System.out.println("Enter number 1");
                                        // user input
                                        input = sc.next();
                                        // if the input is 'c' then the current operation is cancelled and the loop will be exited
                                        if(input.equals("c")){
                                            break;
                                        }
                                        try{
                                            // try to parse the inputs as doubles
                                            numInput1 = Double.parseDouble(input);                               
                                            System.out.println("Enter number 2");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            // call the appropriate function and print result
                                            System.out.println("RESULT: " + calc.add(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    } 
                                    break;
                                case 2:
                                    System.out.println("Subtraction");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number 1");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        }  
                                        try{
                                            numInput1 = Double.parseDouble(input);                                   
                                            System.out.println("Enter number 2");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            System.out.println("RESULT: " + calc.subtract(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }     
                                    break;
                                case 3:
                                    System.out.println("Multiplication");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number 1");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        } 
                                        try{
                                            numInput1 = Double.parseDouble(input);                                   
                                            System.out.println("Enter number 2");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            System.out.println("RESULT: " + calc.multiply(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("Division");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number 1");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        }
                                        try{
                                            numInput1 = Double.parseDouble(input);                                  
                                            System.out.println("Enter number 2");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            System.out.println("RESULT: " + calc.divide(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("Average");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number 1");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        }      
                                        try{
                                            numInput1 = Double.parseDouble(input);                                  
                                            System.out.println("Enter number 2");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            System.out.println("RESULT: " + calc.average(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("Square Root");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        } 
                                        try{
                                            num = Integer.parseInt(input);                                   
                                            System.out.println("RESULT: " + calc.squareRoot(num));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                                case 7:
                                    System.out.println("Exponent");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        } 
                                        try{
                                            numInput1 = Double.parseDouble(input);                                  
                                            System.out.println("Enter exponent");
                                            input = sc.next();
                                            numInput2 = Double.parseDouble(input);
                                            System.out.println("RESULT: " + calc.exponent(numInput1, numInput2));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                                case 8:
                                    System.out.println("Factorial");
                                    System.out.println("Type c to cancel");
                                    while(true){
                                        System.out.println("Enter number");
                                        input = sc.next();
                                        if(input.equals("c")){
                                            break;
                                        }  
                                        try{
                                            num = Integer.parseInt(input);                                  
                                            System.out.println("RESULT: " + calc.factorial(num));
                                        }
                                        catch(Exception e){
                                            System.out.println("Invalid input");
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    catch(Exception e){
                        System.out.println("Invalid input");
                    }    
                }
        }
            sc.close();        
    }
}
