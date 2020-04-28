
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        // while 사용
        int i = 1;
        sum = 0;
        while (i <= 100) { 
            if (i % 2 == 0) { // i%2==1 -> 홀수
                sum = sum + i;
            }
            
            i++; 
        }
        System.out.println(sum);
        // while ...
   

    } // end of main()

}