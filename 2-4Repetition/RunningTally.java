import java.util.Scanner;

class RunningTally {
 public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Let's add some numbers! [Type a negative number to quit]");
     
     int n = 0;
     int t = 0;
     while (n >= 0) {
      n = input.nextInt();
      if (n>=0) t = t + n;
    }
    System.out.println("Your total is " + t);
    
    }
}