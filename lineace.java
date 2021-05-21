public class Lineace{
    public static void main(String[] args){

        int a[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 100};

        int value = 3, i;
        boolean flag = false;

        for(i=0; i<a.length; i++){
            if(a[i] == value){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Element found at " + i + " index");
        else
            System.out.println("Element not found");
    }
}