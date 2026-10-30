//Guesser

import java.util.*;

public class Guesser{
  public static void main(String[] args){
    new Guesser();
  }
  // java test
  public Guesser(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number 4: ");
    int userInput = input.nextInt();
    if (userInput == 4){
      System.out.println("four :)");
    } else {
      System.out.println("WRONG.");
    }
  }
}
