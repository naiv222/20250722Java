
public class ForTest2 {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			System.out.printf("%d단:\t", i);
			for (int j=1; j<10; j++) {
				System.out.printf("\n%d X %d = %d\n", i, j, i*j);
			}
		}
	}
}
