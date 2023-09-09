
package practice.javaprograms1;

public class HillTriangle {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n-1; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			for (int j = 1; j <= i-1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for(int j =5; j >=i; j--) {
				System.out.print("* ");
			}
			for(int j =3; j >=i-1; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
