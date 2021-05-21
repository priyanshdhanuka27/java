class Operators {
    public static void main(String[] args)  {
        // Arithmetic Operators

        int a = 10, b = 10;

        int sum = a + b;
        int difference = a - b;
        int multiply = a * b;
        int divide = a / b;
        int reminder = a % b;

        a += b;     // a = a + b;
        a -= b;     // a = a - b;
        a *= b;     // a = a * b;
        a /= b;     // a = a / b;
        a %= b;     // a = a % b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a--);
        System.out.println(--b);
        System.out.println(a);

        double sq = Math.sqrt(25);
        double power = Math.pow(2, 3);
        double round = Math.round(5.667);
        double c = Math.ceil(5.20);
        double f = Math.floor(5.66);

        System.out.println(sq);
        System.out.println(power);
        System.out.println(round);
        System.out.println(c + "  " + f);

        a = 10; b = 20;
        if(a>b || a != 0)         // >  <  >=  <=  ==  && || !
    }
}