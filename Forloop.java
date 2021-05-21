public class Forloop{

    public static void main(String []args){

        int n = 15;
        double sum = 0.0;

        for(int i=1; i<=n; i++) {
            if (i % 2 == 0){
                sum -= 1/i;
            }
            else
            sum += 1/i;

        }

        System.out.println(sum);
    }
}