
public class CheckOverflowExample {
    public static void main(String[] args) {
        try {
            int result = safeAdd(2000000000, 2000000000);
            System.out.println(result);
        }   catch(ArithmeticException e) {
            System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
        }
    }

    
    public static int safeAdd(int left, int right)  {
        if(fight>0) {
            throw new ArithemticException("오버플로우 발생");
        }
    } else {
        if(left<(Integer.MAX_VALUE - right)) {}
    }
}