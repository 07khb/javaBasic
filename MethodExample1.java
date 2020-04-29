
public class MethodExample1 {
    public static void main(String[] args) {
        //printDouble(30);
        printDouble(10,5);
        // int result = sum(10, 20, 30);
        // System.out.println("result: " + sum(10, 20));
        // System.out.println("result: " + sum(10, 20, 30));
        // System.out.println("1 ~ 10 합: " + toSum(1, 10));
        // printStar(1, 5);
        // System.out.println("================");
        // printStar(1, 3);
        //printStar(3, "HELLO");
        //printStrint("Hello", "Nice~");
       // printGugudan(7);
        Triangle(10);

    }

    public static void Triangle(int a) {
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        


    }

    public static void printGugudan(int dan) {
         System.out.println(dan + "단");
            for(int j = 1; j<=9; j++) {
                System.out.println(dan + " * " + j + " = " + (dan*j));
            }
            
        }


    



    public static void printStrint(String str, String name) { //String = 문자열 표시
        System.out.println(str + " " + name);

    }


    public static void printDouble(int a, int b) {
        System.out.println("결과값은: " + a * b);

    }

    public static void printStar(int a, String asdf) {

        for (int i = 1; i <= a; i++) {
            System.out.println(asdf);

           
        }
    }

    public static int toSum(int q, int w) {
        int sum = 0;
        for (int i = q; i <= w; i++) {
            sum += i; // =>> sum = sum +i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }

}