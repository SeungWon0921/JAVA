package pratice.game369;

public class Game369Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<101; i++) {
//			if(i % 10== 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.printf("%4s", "*");
//			}
//			else if( i >= 30 && i< 40) {
//				System.out.printf("%4s", "*");
//			}
//			else if( i >= 60 && i< 70) {
//				System.out.printf("%4s", "*");
//			}
//			else if( i >= 90 && i< 100) {
//				System.out.printf("%4s", "*");
//			}
//			else System.out.printf( "%4d", i);
//			if(i % 10 == 0) {
//				System.out.println();
//			}
//		}
		int number = 1000;
		
		int i = 1;
		while( i <= number) {
			int k = i;
			while(k > 0) {
				int d1 = k % 10;
				if(d1 == 3 || d1 == 6 || d1 == 9) {
					System.out.printf("%5s", "*");
					break;
				}
				k /= 10;
			}
			if(k == 0) {
				System.out.printf("%5d", i);
			}
			if( i % 10 == 0) System.out.println();
			
			i++;
		}
		
	}

}
