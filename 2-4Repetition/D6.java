import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (a != -1){
        int roll = 0;
        System.out.println("How many D6's do you want to roll?");
            int n = sc.nextInt();
        
        System.out.print("You rolled:");
        int i = 0;
        int t = 0;
        while (i < n) {
            roll = (int) (Math.random()*6) + 1;
            System.out.print(" " +roll+ " ");
            t = t + roll;
            i++;
        }
        System.out.println("");
        System.out.println("Total: " + t);
        System.out.println("Again? [yes/no]");
        String ans = sc.next();
        if (ans.equals("yes")) {
            a++;
        }else {
            a = -1;
        }
    }
    System.out.println("Good-bye!");
    }
}