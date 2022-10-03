/*************************************************
 * Student Name: Nisarg Patel
 * Class: CS 203
 * Program Question:
Write two overloaded methods in a class named MaxOfArray that return the maximum number of an array with the
following headers:

public static int average(int[] array) 
public static double average(double[] array)

Write a main method that prompts the user to enter ten double values, invokes this method, and displays the max
value. Use CamelCase Notation for all identifiers in your program.
 *************************************************/

/* 
Doubt: What's the use of the int function
as it will always go in double, isn't it?
*/

import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static int average(int[] array)  {

    int maxValue = array[0];
    for (int i = 0; i < array.length; i++)
      {
        if(maxValue < array[i])
          maxValue = array[i];
      }

    return maxValue;
  };

public static double average(double[] array) {

  double maxValue = array[0];
    for (int i = 0; i < array.length; i++)
      {
        if(maxValue < array[i])
          maxValue = array[i];
      }

    return maxValue;
};

  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    //Asking the user for all the required input
    System.out.println("Enter the size of the A: ");
    int sizeA = myObj.nextInt();  // Read user input for size

    //Creating the arrays
    double[] arrayA = new double[sizeA];

    //Input for arrray A
    System.out.println("Enter the elements of the A: ");
    for (int i = 0; i < sizeA; i++)
    arrayA[i] = myObj.nextDouble();  // Read user input for size  


        System.out.println("The max number from the given array is: " + average(arrayA) + "\n");

    myObj.close();
  };

}
