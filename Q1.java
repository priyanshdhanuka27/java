import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      String str = "";
      int count = 0;
      for(int i = 0; i< s.length(); i++) {
          if (Character.isLetter(s.charAt(i))) {
              str+=s.charAt(i);
          }
      }
      System.out.println(str);
  }
}