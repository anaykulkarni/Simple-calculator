/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 * 
 * @author Anay
 */
public class Calculator {
    
    double operand1 = 0.0;
    double operand2 = 0.0;
    String result = "";
    Scanner scan = new Scanner(System.in);
    
    public void getData(){
        System.out.println("Enter the first operand: ");
        operand1 = scan.nextDouble();
        System.out.println("Enter the second operand: ");
        operand2 = scan.nextDouble();
        selectOperation(operand1, operand2);
    }
    
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
    
    public double add(double num1, double num2){
        return (num1 + num2);
    }

    public double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    public double multiply(double num1, double num2) {
        return (num1 * num2);
    }

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
    
    public String getResult(){
        return result;
    }
   
}