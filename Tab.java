import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int a[][]=new int[3][3];
        int sumLeft = 0;
        int sumRight = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++){
                a[i][j] = in.nextInt();
                if(i == j) sumLeft += a[i][j];
                if(i+j == 2) sumRight += a[i][j];
            }
        }
        System.out.println(sumLeft);
        System.out.println(sumRight);

        for (int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}