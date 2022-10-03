/*************************************************
 * Student Name: Nisarg Patel and Meet Sonani
 * Class: CS 203
 * Program Question: 
Check if two arrays contain same elements. Write a java program that checks if two arrays have the same elements.
 *************************************************/

/* 
Assumption: 
There is no user error
*/


//Fixed the issue with duplicate numbers
/* A = 1,2,2,2,4 and B = 1,2,2,3,4 */
//Fixed the issue with the array size same constraint

import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object


    //Asking the user for all the required input
    System.out.println("Enter the size of the A: ");
    int sizeA = myObj.nextInt();  // Read user input for size

    System.out.println("Enter the size of the B: ");
    int sizeB = myObj.nextInt();  // Read user input for size

    //Creating the arrays
    int[] arrayA = new int[sizeA];
    int[] arrayB = new int[sizeB];

    //Input for arrray A
    System.out.println("Enter the elements of the A: ");
    for (int i = 0; i < sizeA; i++)
    arrayA[i] = myObj.nextInt();  // Read user input for size  

    //Input for array B
    System.out.println("Enter the elements of the B: ");
    for (int i = 0; i < sizeB; i++)
    arrayB[i] = myObj.nextInt();  // Read user input for size  


  //Fixed the issue with the array size same constraint
    if(arrayA.length != arrayB.length)
    {
      System.out.println("The two arrays doesn't have same size");
      return;
    }

    //Checking each elements for the same size arrays
    int i = 0; //Coutner variable
    int checkStat = -1; //Just used as a flag
    while (i < sizeA)
      {

        for (int j = 0; j < sizeB; j++)
          {
            //If found then trash it at the end of the array
            if (arrayA[i] == arrayB[j])
            {
              int temp = arrayB[sizeB-1];
              arrayB[sizeB-1] = arrayB[j];
              arrayB[j] = temp;
              sizeB--;
              checkStat++;
            }
          }

        //Check if the element of A is in B or not
        if (checkStat == -1)
        {
          System.out.println("The two arrays are not same");
      return;
        }

        //Resetting the counters
        i++;
        checkStat = -1;
      }

    //All good now! Congratulations!
    System.out.println("All elements of A and B are same!!!");
  }
}
