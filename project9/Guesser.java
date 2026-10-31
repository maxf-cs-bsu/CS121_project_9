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
	// System.out.println(randomNum); // cheat for testing
	int attempts = 1;
	while(otherKeepGoing){
          System.out.print(attempts + ") Enter a number: ");
	  int userNum = input.nextInt();
	  if (userNum == randomNum){
            otherKeepGoing = false;
            System.out.println("YOU'RE WINNER");
	  } else if (userNum > randomNum){
            attempts += 1;
	    System.out.println("Too high.");
	  } else if (userNum < randomNum){
            attempts += 1;
	    System.out.println("Too low.");
	  } // end of if

	} // end of other keepGoing while loop

      } else if (response.equals("2")){
        System.out.println("Think of a number between 1 and 100 and I'll try to guess it! (No cheating!)");

	boolean cpuKeepGoing = true;
	int low = 1;
	int high = 100;
	int cpuAttempts = 1;
	while(cpuKeepGoing){
          int cpuGuess = (low + high) / 2;
	  System.out.println(cpuAttempts + ") I guess: " + cpuGuess);
	  System.out.print("Too (H)igh, too (L)ow, or (C)orrect?: ");

          String cpuMenu = input.nextLine();
	  if (cpuMenu.equalsIgnoreCase("H")){
            high = cpuGuess - 1;
	    cpuAttempts += 1;
	  } else if (cpuMenu.equalsIgnoreCase("L")){
            low = cpuGuess + 1;
	    cpuAttempts += 1;
	  } else if (cpuMenu.equalsIgnoreCase("C")){
            cpuKeepGoing = false;
	    System.out.println("I win!");
	  } // end of if
	} // end of cpuKeepGoing
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
