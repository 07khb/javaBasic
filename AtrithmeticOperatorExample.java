
public class AtrithmeticOperatorExample {
	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		
		int result = num1 /num2;
		System.out.println("result: " + result); //2
		
		result = num1 % num2;
		System.out.println("result: " + result); //2
		
		int num3 = 123;
		if (num3 % 2 ==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}