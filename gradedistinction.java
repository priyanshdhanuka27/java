import java.util.Scanner;
class gradedistinction{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter grade average: ");
        int grades = in.nextInt();

        if(grades>= 80)  {
            System.out.println("Distinction");
        } 
        else if(grades < 80 && grades >= 60) {
            System.out.println("First Division");
        }
        else if(grades >= 45 && grades < 60)  {
            System.out.println("Second Division");
        }
        else if(grades >=40 && grades < 45){
            System.out.println("Pass");
        }
        else{
            System.out.println("No Grade");
        }

    }
}

