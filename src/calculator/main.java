package calculator;
import java.util.ArrayList;     /* Import arraylist */
import java.util.Scanner;       /* Import scanner for user input */

/* Main class */
public class main {
    
    /* Boolean function that checks input is a valid double */
    static boolean validateInput(String input){
        /* If parse is successful return true */
        try{
            Double.parseDouble(input);                               
            return true;
        }
        /* Else return false */
        catch(NumberFormatException e){
            return false;
        }
    }
    
    /* Main fnction */
    public static void main(String[] args) {
        /* Scanner for reading user input */
        Scanner sc = new Scanner(System.in);
     
        /* Menu for user */
        String menu = "Calculator Menu "
                + "\n Type 1 for addition. Type 2 for subtraction."
                + "\n Type 3 for multiplication. Type 4 for division."
                + "\n Type 5 for modulus. Type 6 for average."
                + "\n Type 7 for square root. Type 8 for power."
                + "\n Type 9 for factorial. Type 0 to exit program. \n";
        System.out.print(menu);
        
        /* Continuous loop unless break */
        while(true){
            System.out.println("Enter choice");
            System.out.println("Type m for menu");
            /* Read user input */
            String input = sc.next();
            /* If user enters 'm' then show menu */
            if(input.equals("m")){
                System.out.println(menu);
            }
            /* Else input should be a number */
            else{
                /* Use try/catch to parse input as number */
                try{
                    /* Variable to store the choice input by user as integer */                          
                    int option = Integer.parseInt(input);
                    /* Exit the program if zero is input */
                    if(option == 0){
                        break;
                    }
                    /* Instance of Calculator class */
                    Calculator calc = new Calculator();
                    
                    /* Variables to store number inputs as doubles */ 
                    double numInput,numInput2;             
                    /* Depending on the number entered, a different mathematical
                       function is applied 
                    */
                    switch(option){
                        /* 1. Addition function */
                        case 1:
                            System.out.println("Addition");        
                            /* Continuous loop unless break */
                            while(true){
                                System.out.println("Enter first number");
                                /* Read user input */
                                input = sc.next();
                                /* Call function to check input is numeric.
                                   If it is parse to double and break out of loop
                                */
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Same process for second number */
                            while(true){
                                System.out.println("Enter second number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the add function and print the result */
                            System.out.println("RESULT: " + calc.add(numInput, numInput2));                              
                            break;
                        /* 2. Subtraction function */
                        case 2:
                            System.out.println("Subtraction");
                            while(true){
                                System.out.println("Enter first number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            while(true){
                                System.out.println("Enter second number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the subtract function and print the result */
                            System.out.println("RESULT: " + calc.subtract(numInput, numInput2));
                            break;
                        /* 3. Multiplication function */
                        case 3:
                            System.out.println("Multiplication");
                            while(true){
                                System.out.println("Enter first number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            while(true){
                                System.out.println("Enter second number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the multiply function and print the result */
                            System.out.println("RESULT: " + calc.multiply(numInput, numInput2));
                            break;
                        /* 4. Division function */
                        case 4:
                            System.out.println("Division");
                            while(true){
                                System.out.println("Enter first number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            while(true){
                                System.out.println("Enter second number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the divide function and print the result */
                            System.out.println("RESULT: " + calc.divide(numInput, numInput2));
                            break;
                        /* 5. Modulus function */
                        case 5:
                            System.out.println("Modulus");
                            while(true){
                                System.out.println("Enter first number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            while(true){
                                System.out.println("Enter second number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the modulus function and print the result */
                            System.out.println("RESULT: " + calc.modulus(numInput, numInput2));
                            break;
                        /* 6. Average function */
                        case 6:
                            System.out.println("Average");
                            /* Continuous loop until break */
                            while(true){
                                System.out.println("Enter a sequence of numbers."
                                + "\nAny non-numeric input will end sequence");
                                /* Arraylist to store nubers */
                                ArrayList<Double> nums = new ArrayList<>();
                                /* Continous loop until break */
                                while(true){
                                    input = sc.next();
                                    /* If input is numeric then parse to double 
                                       and add to arraylist
                                    */
                                    if(validateInput(input)){
                                        numInput = Double.parseDouble(input);
                                        nums.add(numInput);                                       
                                    }
                                    /* Else non numeric so break out of loop */
                                    else{
                                        break;
                                    }
                                }
                                /* If there are two or more numbers in the list 
                                   call the average function and print the result
                                */
                                if(nums.size() > 1){
                                    System.out.println("RESULT: " + calc.average(nums));
                                    break;
                                }
                                else{
                                    System.out.println("Not enough numbers");
                                }
                            }
                            break;
                        /* 7. Square root function */
                        case 7:
                            System.out.println("Square Root");
                            while(true){
                                System.out.println("Enter number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the square root function and print the result */
                            System.out.println("RESULT: " + calc.squareRoot((int)numInput));
                            break;
                        /* 8. Power function */
                        case 8:
                            System.out.println("Power");
                            while(true){
                                System.out.println("Enter number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            while(true){
                                System.out.println("Enter exponent");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput2 = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the power function and print the result */
                            System.out.println("RESULT: " + calc.power(numInput, (int)numInput2));
                            break;
                        /* 9. Factorial function */
                        case 9:
                            System.out.println("Factorial");
                            while(true){
                                System.out.println("Enter number");
                                input = sc.next();
                                if(validateInput(input)){
                                    numInput = Double.parseDouble(input);
                                    break;
                                }
                                else{
                                    System.out.println("Not a number");
                                }
                            }
                            /* Call the factorial function and print the result */
                            System.out.println("RESULT: " + calc.factorial((int)numInput));
                            break;
                        /* Default case where input is not between 1 and 9 */
                        default:
                            System.out.println("Please enter a number between 1 and 9");
                    }   /* End switch */
                    
                }   /* End try */
                catch(NumberFormatException e){
                    System.out.println("Invalid input");
                }    
            }   /* End else */
            
        }   /* End while true */
         
        /* Close scanner */    
        sc.close(); 
        
    }   /* End main function */
    
}   /* End main class */  
