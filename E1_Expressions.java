package com.mthree.exercises;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 11/10/2022
 * purpose: Expressions exercise
 * 
 */

public class E1_Expressions {
    public static void main(String[] args) {
        //declare varaibles to use in the exercise:
        int result;
        int op1;
        int op2;
        int op3;
        
        //
        //Assignment:
        //
        
        //set the 'result' variable to '0' by using the 'assignment' (=) opperator:
        result = 0;
        //the 'result' variable now has the vlaue 'o'
        
        //give values to op1 and op2:
        op1 = 5;
        op2 = 7;
        
        //you can assign values to variables by assigning them to equal the same as another variable:
        //assign the value of op2 to op3:
        op3 = op2;
        //now both op2 and op3 should have the value of '7'
        
        //
        //Addition:
        //
        
        //addition (+) is an infix operator as it works in between two variables:
        result = 42 + 53;
        //result now equals '95'

        //it can also be used to add variables:
        result = op1 + op2;
        //result now equals '12'

        //it can work with a combination of literals and variables:
        result = 1 + op1;
        //result now equals '6'

        //you can perform multiple variable additions:
        result = 1 + op1 + op2 + op3;
        //result now equals '20'

        //the '+=' operator is used to add a value to a variable
        //'result += op1' is equivalent to 'result = result + op1'
        // NOTE: the initial value of 'result' will be used to calculate the new value of 'result;:
        //
        //first, set result to '2':
        result = 2;
        
        //next, use the '+=' operator to add the value '4' to the already valued 'result' (2):
        result += 4;
        //result is now equal to '6' (2 + 4)
        
        //similarly, add the value of 'op1' (5) to the current value of 'result': 
        result += op1; 
        //result is now equal to '11' (6 + 5)
        
        //
        //Subtraction:
        //
        
        //subtraction (-) is also an infix operator:
        result = 9 - 5; 
        //result is now '4'

        //similarly, it can work with variables:
        result = op1 - op2;  
        //result now equals '-2'

        //it also works with a combination of literals and variables:
        result = 15 - op1;
        //result now equals '10'

        //you can perform multible variable subtractions:
        result = 19 - op1 - op2 - op3;
        //result now equals '0'

        //the '-=' operator is used to subtract a value from a variable
        //'result -= op1' is equivalent to 'result = result - op1'
        //NOTE: the initial value of 'result' is used to calculate the new value of 'result':
        //first, set result to '2':
        result = 2;
        
        //next use the '-=' operator to subtract the value '4' from the already valued 'result' (2):
        result -= 4;
        //result is now equal to '-2' (2 - 4)
        
        //similarly, reduce 'result' by the value of 'op1' (5):
        result -= op1; 
        //result is now equal to '-7' (-2 - 5)

        //
        //Multiplication:
        //
        
        //multiplication (*) is also an infix operator:
        result = 2 * 3;  
        //result is now '6'

        //it also works with variables:
        result = op1 * op2;
        //result now equals '35'

        //it works with a combination of literals and variables:
        result = 2 * op1;
        //result now equals '10'

        //you can perform multiple variable multiplications:
        result = 2 * op1 * op2 * op3;
        //result now equals '490'

        //the '*=' operator is used to add a value to a variable
        //'result *= op1' is equivalent to 'result = result * operand1'
        // NOTE: the initial value of result is used to calculate the new value of result:
        //first, set result to '2'
        result = 2;
        
        //next, use the '*=' operator to multiply the value of '4' to the already valued 'result' (2):
        result *= 4;
        //result is now equal to '8' (2 * 4)
        
        //similarly, multiply 'result' by the value of 'op1' (5):
        result *= op1;
        //result is now equal to '40' (8 * 5)
        
        
        //
        //Division and Modulus:
        //
        
        //division (/) is also an infix operator:
        result = 6 / 3;
        //result is now '2'

        //it also works with variables:
        result = op1 / op2;
        //result now equals '0'

        //NOTE: when dividing integers, integer division is used - we only get the whole number part of the result
        //In this case, 7 goes into 5 0 times with a remainder of 5
        
        //the modulus operator (%) can be used to get the remainder:
        result = op1 % op2;
        //result now equals '5'

        //it works with a combination of literals and variables:
        result = 20 / op1;
        //result now equals '4'

        //you can perform multiple variable divisions:
        result = 245 / op1 / op2 / op3;
        //result now equals '1'

        //the '/=' operator is used to add a value to a variable
        //'result /= operand1' is equivalent to 'result = result / operand1':
        // NOTE: the initial value of result is used to calculate the new value of result:
        //first, set result to '40':
        result = 40;
        
        //next, use the '/=' operator to divide the value of '4' to the already valued 'result' (40):
        result /= 4;
        //result is now equal to '10' (40 / 4)
        
        //similarly, divide 'result' by the value of 'op1' (5):
        result /= op1;
        //result is now equal to '2' (10 / 5)
    }
}
