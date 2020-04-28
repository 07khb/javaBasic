
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = 2;
        for(int e=1; e<=9; e++){
            for( int i=1; i<=9; i++){
            sum = e * i;
            System.out.printf(e + " * " + i + " = " + sum + "   ");
        }   System.out.println();
    }
        //System.out.println("sum: " + sum);
        //System.out.println(2 + " * " + 1 + " = " + (2*1));
        //System.out.println(2 + " * " + 2 + " = " + (2*2));
        //System.out.println(2 + " * " + 3 + " = " + (2*3));
    }

}