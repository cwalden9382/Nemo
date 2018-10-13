//Christopher Walden

/*A program that holds a conversation and interacts with the user.
The program (Nemo) will ask the user a variety of questions about themselves
and may even ask them to partake in games and math questions of some sort.*/

/*Java has 8 primitive data types that include: boolean, byte, char, short, int
 *long, float, and double. 
 *
 *    Byte: 8-bit signed two's compliment integer. Minimum value of -128 and a
 *    max of 127(inclusive). Can be used in place of 'int' where their limits 
 *    help to clarify your code.
 *     
 *    Short: 16-bit. Minimum value of -32768 and max of 32767 (inclusive)
 *    .
 *    Int: 32-bit. Minimum of -2^31 to (2^31)-1. Used in java to assign integers.
 *    
 *    Long: 64-bit. Used when you need a range of values wider than those
 *    provided by int.
 *    
 *    Float: For extremely large numbers. Should never be used for precise values.
 *    
 *    Double: The default choice for decimal values. Should never be used for
 *    precise values.
 *    
 *    Boolean: either true or false
 *    
 *    Char: For a 16 bit Unicode character.
 *   
 * Operator precedence is when operators share an operand, the operator with
 * the higher precedence goes first. 
 */

import java.util.Scanner;
import java.util.Random;
import java.lang.Math.*;

public class IntProject {

    public static void main(String[] args) {
           
           System.out.println("Hello, my name is Nemo.\n");
           System.out.println("Today I'm going to be learning a bit "
                   + "about you.\n");
           System.out.print("But first, enter your name:\n");
           //The program introduces itself and asks for the user's name
           
           Scanner inputUser = new Scanner(System.in);
           String userName = inputUser.nextLine();
           //The scanner taking the user's name.
           
           System.out.println("Hello " + userName + ", it's nice to meet you.");
           
           System.out.println("Would you like to play a game, "
           + userName + "?");
           
           String answerPlay = inputUser.nextLine();
           
           
           if (answerPlay.equalsIgnoreCase("Yes\n")) {
               System.out.println("Great, let's get started!\n");
           }
           else {
               System.out.println("Well I want to play a game! So too bad!\n");
           }
           //54-62 asking the user if they wish to play a game.
           
           System.out.println("I'm going to pick 3 numbers between 1 and 7.");
           System.out.println("If you can guess one of those numbers, "
                   + "you win.\n");
           System.out.println("Ready? What is your guess? ");
           
           int numGuess = inputUser.nextInt();
           System.out.println("So your guess is " + numGuess + 
                   ". My 3 numbers are: ");
                      
           Random nemoNum = new Random();
           int number;
           
           for(int counter=1; counter<=3;counter++) {
               number = 1+nemoNum.nextInt(7);
               System.out.println(number + " ");
               
               if (numGuess == number) { // == is used to see if two variables are equal
                   boolean guessRight = true;
                   System.out.println("Great guess!");
               }
               else {
                   boolean guessRight = false;
                   System.out.println("That's unfortunate.");
               }              
           }  
           
           
           
           System.out.println("");
           System.out.println("Some of us are lucky and some of us aren't!");
           System.out.println("");
           
           System.out.println("How about we test some of your math skills.");
           System.out.println("");
           System.out.println("Im going to give you 2 numbers and you must "
                   + "subtract them without using a calculator!");
           
           final double firstNum; //final variables always contain the same value
           final double secNum;   //final variables cannot be changed
           
           firstNum = 10.5;
           secNum = 23.3;
           
           System.out.println("What is the value of " + secNum
                   + " - " + firstNum + "?");
           
           double addGuess = inputUser.nextDouble();
           
           if (addGuess == secNum - firstNum) {
               System.out.println("Correct!");
           }
           else {
               System.out.println("Incorrect. Let's try something else.");
               
           }
           
           inputUser.close();
           
           System.out.println("What would the area of a circle be if given"
                   + " a raidus of 3 meters?");
           
           double areaOfCircle = Math.pow(3, 2) * Math.PI;
           
           System.out.println("");
           System.out.println(areaOfCircle + "would be the correct answer!");
           
           
                   
                
    }
}