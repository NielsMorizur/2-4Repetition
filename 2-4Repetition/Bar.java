import java.util.Scanner;

class Bar {
 public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("What character do you want your bar made of?");
        String c = input.next();
     System.out.println("How long do you want your bar?");
        int x = input.nextInt();
     System.out.println("Here's your bar!");
     int i = 0;
        while (i < x) {
         System.out.print(c);   
         i++;   
        }
    }
}