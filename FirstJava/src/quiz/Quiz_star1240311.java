package quiz;

public class Quiz_star1240311 {

	public static void main(String[] args) {
		// 피라미드 찍기
		
		/*
		 *     #1 *
		 *       ***
		 *      *****
		 *     *******
		 *    *********
		 */
		
		int dan = 5;
		
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j<dan -i -1 ; j++) {
				System.out.print(" ");
		    }
			for(int j = 0; j < i * 2 + 1 ; j++) {
			System.out.print("*");
		    }
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < i; j++ ) {
				System.out.print(" ");
		    }
			for(int j=0; j<2*dan -(2*i) -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}