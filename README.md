# Compute-Average-assignment
This repository contains my programming assignment
 //intiating a library to get the user input
import java.util.Scanner;

public class computeAverage {
     //initializing the main method
     public static void main(String[] args){

     //decalring the scanner object to get the user input from the console 
     Scanner input = new Scanner(System.in);

//prompting th user to make an input of four numbers
System.out.println("Enter first number: ");
double firstValue = input.nextDouble();
System.out.println("Enter Second number: ");
double secondValue = input.nextDouble();
System.out.println("Enter third number: ");
double thirdValue = input.nextDouble();
System.out.println("Enter fourth number: ");
double fourthValue = input.nextDouble();



//computing the average on the entered values
double Average = (firstValue + secondValue + thirdValue + fourthValue) / 4;
//printing the average to the console
System.out.println("Average: " + Average);

   //closing the input object
  input.close();
     }
}
