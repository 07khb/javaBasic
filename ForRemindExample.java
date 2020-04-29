
public class ForRemindExample {
    public static void main(String[] args) {
        // 1부터 20까지 출력
        // sum 2의 배수의 합
        // 홀수만 출력
        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
                continue;
            } else {
                System.out.println(i + "은 홀수입니다.");

            }
            System.out.println(i);
        }
        System.out.println("짝수의 합: " + sum);

    }

}