/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 * The class Calculator supports some simple arithmetic operations
 * such as addition, subtraction, multiplication and division.
 * The results of the calculations is in the form of a String.
 * 
 * @version     1.1     31 May 2018
 * @author      Anay Kulkarni
 */
public class Calculator {
    
    double operand1 = 0.0;
    double operand2 = 0.0;
    String result = "";
    Scanner scan = new Scanner(System.in);
    
    /**
     * This method simply gets the values of the operands from the standard input,
     * on which an operation is to be performed.
     * The operands are stored as double precision floating point (double) values.
     * Then the method call to select the operation to be performed is made. 
     */
    public void getData(){
        System.out.println("Enter the first operand: ");
        operand1 = scan.nextDouble();
        System.out.println("Enter the second operand: ");
        operand2 = scan.nextDouble();
        selectOperation(operand1, operand2);
    }
    
    /**
     * This method selects the operation to be performed on the operands, based on the user input.
     * The user gives the input from the standard input.
     * @param num1 This is first operand on which the operation is to be performed.
     * @param num2 This is the second operand.
     */
    public void selectOperation(double num1, double num2){
        int choice;
        choice = scan.nextInt();
        switch(choice){
            case 1:
                result = Double.toString(this.add(num1, num2));
                break;
            case 2:
                result = Double.toString(this.subtract(num1, num2));
                break;
            case 3:
                result = Double.toString(this.multiply(num1, num2));
                break;
            case 4:
                this.divide(num1, num2);
                break;
            case 5: 
                return;
            default: System.out.println("You entered an invalid choice!");
        }
    }
    
    /**
     * This method adds the two operands.
     * @param num1 this is the first operand
     * @param num2 this is the second operand
     * @return the sum of the operands, <code> num1 + num2 </code>
     */
    public double add(double num1, double num2){
        return (num1 + num2);
    }
    
    /**
     * This method gives the difference between the operands
     * @param num1 this is the first operand
     * @param num2 this is the second operand
     * @return the difference given by, <code> num1 - num2 </code>
     */
    public double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    /**
     * This method gives the product of the operands
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the product of the operands, <code> num1 * num2 </code>
     */
    public double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    /**
     * This method returns the quotient obtained from division of the operands
     * Illegal division of operands such as <code> 0/0 </code> and divide by zero is prevented
     * and an error message is displayed.
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the quotient given by, <code> num1 / num2 </code>
     */
    public double divide(double num1, double num2) {
        if((num1 == 0) && (num2 == 0))
            result = "ERROR: Indertiminate form!";      /* stores a message in the result and prevents 0/0 */
        else if(num2 == 0)
            result = "ERROR: Cannot divide by zero!";   /* stores a message in the result and prevents divide by zero */ 
        else{
            result = Double.toString((num1 / num2));    /* stores the result of division as a string */
            return (num1/num2);
        }   
        return 0;                                       /* returns zero indicating incorrect division was prevented.
                                                           In this case, the returned result is not stored anywhere */
    }
    
    /**
     * This method simply returns the result of the arithmetic operation.
     * @return the result
     */
    public String getResult(){
        return result;
    }
   
}