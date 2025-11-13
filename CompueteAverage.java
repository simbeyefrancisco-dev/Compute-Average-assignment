//FRANCISCO SIMBEYE NCE/SCI/319/23
//Calling thw java util library to get user input
import java.util.Scanner;

public class CompueteAverage{
    //initialingthe main function
    public static void main(String[] args){

        //creating ascanner object to get the user input
        Scanner input = new Scanner(System.in);

        //prompting the user to input the four numbers foraverage computation
        System.out.println("Enter the first term: ");
        double firstNumber = input.nextDouble();
        System.out.println("Enter the second term: ");
        double secondNumber = input.nextDouble();
        System.out.println("Enter the third term: ");
        double thirdNumber = input.nextDouble();
        System.out.println("Enter the fourth term: ");
        double fourthNumber = input.nextDouble();

        //calcukating the averageof the four numbers
        double average = (firstNumber + secondNumber + thirdNumber + fourthNumber)/4;

        //printing tneaverage number to the console output
        System.out.println("Average: " + average);

        //closing the input object
        input.close();

    }
}