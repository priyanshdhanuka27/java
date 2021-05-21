class IfElse{
    public static void main(String[] args)  {
        int a = 10, b = 12, c = 8;

        if(a > b) {
            if(a > c) {
                System.out.println("a is the greatest");
            }
            else if(c > b){
                System.out.println("c is the greatest");
            }
        } else if(b > c)   
            System.out.println("b is the greatest");

        int greatest = (a>b) ? (a > c) ? a : (c > b) ? c : b : (b > c) ? b : b;
        System.out.println(greatest);
    
    }
}