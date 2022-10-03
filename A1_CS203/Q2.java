/*************************************************
 * Student Name: Nisarg Patel
 * Class: CS 203
 * Program Question:
Write a program in java to ask a string of characters (minimum of 10 characters) from the user. The program goes 
ahead to capitalize on the first character and checks the number of vowels in the string and the total number of 
characters in the string. 
NB: Implement a method
*************************************************/


import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {

    System.out.println("Please enter the string (minimum it should be more than 10 character long): ");
    String str;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    do {
      str = myObj.nextLine();

      if (str.length() <= 10)
        System.out.println("Hello user, you have enter a string less than 10 character, Please enter again::");
    } while (str.length() <= 10);

    // capitalize first letter
    str = str.substring(0, 1).toUpperCase() + str.substring(1);

    
    //Check the number of vowels and character in the string, except the space
    int vowelcount = 0;
    int charactercount = 0;
    for (int i = 0; i < str.length(); i++) {
      char test = str.charAt(i);
      test = Character.toLowerCase(test);
      if (test == 'a' || test == 'e' || test == 'i' || test == 'o' || test == 'u')
        vowelcount++;

      // To make the code not count the space as the character for the string
      if (test != ' ')
        charactercount++;
    }

    System.out.println("The string after capitalizing the first character is: " + str);

    System.out.println("The number of vowels is: " + vowelcount);
    System.out.println("The number of characters is: " + charactercount);

    myObj.close();
  }
}
