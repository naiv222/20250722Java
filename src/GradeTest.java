import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다.");
		}
		
		else {
			switch(score/10) {
				case 10: case 9:
					System.out.println("A");
					break;
				
				case 8:
					System.out.println("B");
					break;
				
				case 7:
					System.out.println("C");
					break;
				
				default:
					System.out.println("F");
			}
		}
	}
}