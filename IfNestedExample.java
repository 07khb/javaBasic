
public class IfNestedExample {
    public static void main(String[] args) {
      
        int num = (int) (Math.random() * 6) + 1; // Math.random()0<1 조건의 숫자 랜덤으로 생성 0.????
        if (num == 1) {
            System.out.println("번호 1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("번호 2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("번호 3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("번호 4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("번호 5번이 나왔습니다.");
        } else {
            System.out.println("번호 6번이 나왔습니다.");
            // System.out.println(" 입니다.");
        }
        System.out.println("end of program.");
    
    
    }

}