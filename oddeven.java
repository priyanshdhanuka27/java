// Given an integer N as input, can you check the following:
// ·        If N is odd then print "Weird"
// ·        If N is even and, in between range 2 and 5(inclusive), print "Not Weird"
// ·        If N is even and, in between range 6 and 20(inclusive), print "Weird"
// ·        If N is even and, print "Not Weird"
import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else {
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
            
            //Complete the code
            
        }
        System.out.println(ans);
            
    }
}