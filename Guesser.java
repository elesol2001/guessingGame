import java.io.Console;
import java.util.Scanner;

/**
 * Assignment 1 - Guessing Game
 * 
 * Here's the unfinished source code
 * for the Guesser class. It is your
 * task to complete the missing parts.
 */
public class Guesser{
  private int low;
  private int high;

  public Guesser(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public void start(){
    rules();
    doGuesses();
  }

  private void rules(){
    System.out.println("Think of a number between " +
                       low + " and "  + high);
    System.out.println("I'm going to ask a few questions in order " +
                       "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

  private String getReply(){
    Scanner scanner = new Scanner(System.in);
    String reply;
    while (true) {
      reply=scanner.nextLine();
      if (reply.equals("T") || reply.equals("F")) {
        return reply;
      }
      else {
        System.out.println("Please answer T for true, and F for false");
      }
    }
  }

  private void doGuesses(){
    int i=0; // number of guesses
    int middle=0;
    while(low<high){
      // Set next guess to the middle between
      // current low and current high
      middle=low + (high-low)/2;

      System.out.println("Is the number less than or equal to " +
                         middle + "?");
      String reply = getReply();
      if("T".equals(reply)){
        // The number is less than or equal to middle
        // so we move down high to middle
        high = middle;
      }else{
        // The number is greater than middle,
        // so we move up low to middle + 1
        low = middle + 1;
      }
      i++; // One more guess!
    }
    // When low has met high, we don't enter the loop
    // and we have found the number
    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses){
    System.out.println("You were thinking about " +
                       guess +
                       " (took me " + numberOfGuesses +
                       " guesses)");
  }

}
