
public class ForRemind2 {
    public static void main(String[] args) {
        // 1부터 20까지 출력
        // 2또는 3의 배수 ||
        // 2와 3의 배수 &&
        for (int i = 1; i <= 20; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2 와 3의 배수: " + i);
            }
            else if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println("2 또는 3의 배수: " + i);
            }  
        }
    }
}