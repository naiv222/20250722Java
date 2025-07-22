import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String inputData = sc.nextLine();
		
		int num = Integer.parseInt(inputData);
		System.out.println(num + 10);
		
		//System.out.println(Interger.parsInt(inputData) + 10);
	}
}
