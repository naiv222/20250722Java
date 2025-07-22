import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		
		System.out.printf("정수: %d\n", num);
		System.out.printf("문자열: %s", inputData);
		
//		if(num > 0) {
//			System.out.printf("양수입니다");
//		}
//		else if(num < 0) {
//			System.out.printf("음수입니다");
//		}
//		else {
//			System.out.printf("0입니다");
//		}
	}
}
