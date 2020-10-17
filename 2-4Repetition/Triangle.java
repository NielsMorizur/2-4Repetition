import java.util.Scanner;

class Triangle {
 public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("What character do you want your triangle made of?");
        String c = input.next();
     System.out.println("How tall do you want your triangle?");
        int x = input.nextInt();
     
     int i = 0;
     while (i < x) {
         for (int a = 0; a <= i; a++) {
             System.out.print(c);
         }
         System.out.println("");
         i++;
        }
    }
}