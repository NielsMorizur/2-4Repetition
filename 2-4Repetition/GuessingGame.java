import java.util.Scanner;

class GuessingGame {
 public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     
     int n = (int) (Math.random()*100) + 1;
     System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
     
     int i = 0;
     while (i != -1) {
         System.out.print("What is your guess?");
         int g = input.nextInt();
         if (g > n) {
             System.out.println("Too high...");
             i++;
            }else if (g < n) {
             System.out.println("Too low...");
             i++;
            }else if (g == n) {
            i++;
            System.out.println("You've guessed my number! Good job! It only took you " + i + " tries");
            i = -1;
            }
         
        }
    }
}