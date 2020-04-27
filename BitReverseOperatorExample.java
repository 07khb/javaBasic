
public class BitReverseOperatorExample {
	public static void main (String [] args) {
		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;
		
		//java 
		
		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);
		//10진수를 2진수로 바꿈
		String returnValue1 = toBinaryString(num2);
		System.out.println(returnValue1);
		//위에거를 반전시킴
		String returnValue2 = toBinaryString(num3);
		System.out.println(returnValue2);
		//첫번째거와 합치면 0
	}
	
	public static String toBinaryString(int val) {
		String str  = Integer.toBinaryString(val);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
	
}