# Java Guesser
### Guesser
```
import java.utli

public class Guesser // main definer
  public static void main(String[] args)
    public Guesser();

  public Guesser(){
    Scanner input = new Scanner(System.in)
    call menu() for response
    if response = 1
      system.out.println("Guess a number between 1 and 100: );
      answer = (random int value from 1 to 100)
      attempts = 1
      while keepGoing = true
        system.out.println(attemptNumber + ") Please enter a number: ");
        get int userInput
         
        if userInput == answer
          keepGoing = false
          system.out.println("you are a win!")
        else if userInput < answer
          system.out.println("too low")
          attemptNumber goes up 1
        else if userInput > answer
          system.outprintLn("too high")
          attemptNumber goes up 1

    if else response = 2
      system.out.println("i'm gonna guess what number you're thinking of from 1 to 100...")
      attempts = 1
      string menuCpu = ("Too (H)igh, too (L)ow, or (C)orrect?");
      boolean keepGoing = true;
      while(keepGoing)
        if menuCpu = h
          have computer guess higher
        else if menuCpu = l
          have omputer guess lower
        else if menuCpu = c
          keepGoing = false;
          system.out.println("I win")
 
  make a public string menu for UI
    system.out.println("0) Exit ");
    system.out.println("1) Human Guesser");
    system.out.println("2) Computer Guesser");
    string response = input.nextLine();
    return response

```
