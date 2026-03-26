/*
The goal is to creat a basic calculator to perform the following with two numbers provided by the user:
Addition, Subtraction, Multiplication, Division

I am using differnt methods for each function.
*/

import java.util.Scanner;

public class JavaCode {

    //The Main Code
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Introduction
        System.out.println("Hello! Welcome to your personal calculator!");
        
        //Activator to keep the computer on or turn it off
        boolean turnOn = true;
        //Used to change the output provided if the calculator is used more than once
        boolean reactivate = false;
        
        //Beginning statement
        System.out.println("What function would you like to perform? Please provide only the number attached for your desired option.");

        //Begin main code
        while (turnOn == true){
            
            //Used if the user wants to use the calculator more than once
            if (reactivate == true){
                System.out.println("Please choose a function:");
            }

            //Asking functions
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.print("Your choice: ");
            int choice = input.nextInt();
            System.out.println();

            //Ensurig the provided choice is valid
            boolean fail = true;
            for (int i = 1 ; i <= 4 ; i++){
                if (i == choice){
                    fail = false;
                    break;
                }
            }

            //If the choice is valid the continue, otherwise restart the process
            if (fail == false){
                double result = 0;

                System.out.print("Please provide your first number: ");
                double number1 = input.nextInt();
                System.out.println();

                System.out.print("Please provide your second number: ");
                double number2 = input.nextInt();
                System.out.println();
                
                //Choice is Addition
                if (choice == 1){
                    result = addition(number1, number2);
                }
                //Choice is Subtraction
                else if (choice == 2){
                    result = subtraction(number1, number2);
                }
                //Choice is Multiplication
                else if (choice == 3){
                    result = multiplication(number1, number2);
                }
                //Choice is Division
                else if (choice == 4){
                    result = division(number1, number2);
                }
                
                //Providing result
                System.out.println("Result: " + result);

                //Asking the user if they would like to perform another function
                System.out.println("Would you like to perform another function?");
                System.out.println("1) Yes");
                System.out.println("2) No");
                System.out.print("Answer: ");
                int continueChoice = input.nextInt();
                System.out.println();

                if (continueChoice == 2){
                    fail = true;
                }

            }
            else{
                System.out.println("You provided an incorrect option.");
            }

            System.out.println("Goodbye");

        }
    }

    //Addition Method
    public static double addition(double number1, double number2){
        double total = number1 + number2;
        return total;
    }

    //Subtraction Method
    public static double subtraction(double number1, double number2){
        double total = number1 - number2;
        return total;
    }

    //Multiplication Method
    public static double multiplication(double number1, double number2){
        double total = number1 * number2;
        return total;
    }

    //Division Method
    public static double division(double number1, double number2){
        double total = number1 / number2;
        return total;
    }

}