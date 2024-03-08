package quiz;

public class quiz_240308_PM {

	public static void main(String[] args) {
		// 1. 100부터 1까지 순서대로 출력해보세요.
		for(int i = 100; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		// 2. 1 ~ 200 사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총 합을 구해보세요.
		int sum = 0;
		for(int j = 1; j<=200; j ++) {
			if(j %2 != 0 && j %3 != 0) {
				sum +=j;
			}	
		}
		System.out.println("합은 : " + sum);
		System.out.println();
		// 3. 1+ (1+2) + (1+2+3) + . . . + (1+2+3+4+5+6+7+8+9+10)의 결과를 구해보세요.
		int odd = 0;
		int asd = 0;
		for(int k = 1; k<=10; k++) {
			odd +=k;
			asd +=odd;
			}
		System.out.println("합은 : " + asd);
		
 }
}
