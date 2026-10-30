//Guesser

import java.util.*;

public class Guesser{
  Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    new Guesser();
  } // end of main

  public Guesser(){

    boolean keepGoing = true;
    
    while(keepGoing){
      String response = menu();
      
      if (response.equals("0")){
        System.out.println("Thank you for playing!");
	keepGoing = false;
      } else if (response.equals("1")){
        System.out.println("I'm thinking of a number between 1 and 100, try to guess it!");

	boolean otherKeepGoing = true;
	int randomNum = (int) (Math.random() * 100);
	int attempts = 1
	while(otherKeepGoing){
          System.out.print(attempts + ") Enter a number: ");
	  int userNum = input.nextInt();
	  if (userNum.equals(randomNum)){
            //temp code
	  }



	} // end of other keepGoing while loop

      } else if (response.equals("2")){
        System.out.println("you pressed 2! this is also temp text for the sake of testing things.");
      } // end of if

    } // end of while
  } // end of constructor

  public String menu(){
    System.out.println("0) Exit ");
    System.out.println("1) Human Guesser ");
    System.out.println("2) Computer Guesser ");
    String response = input.nextLine();
    return response;
  } // end of menu
} // end of Guesser
