package algorithm16;

public class Star {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for(int k = 5; k > i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
