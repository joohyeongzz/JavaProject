package quiz;

public class Quiz_while {

	public static void main(String[] args) {
		// while문을 이용하여 구구단을 다음과 같이 세로로 출력해 주세요.
		
		// 2단		3단		4단
		// 2x1=2	3x1=3	4x1=4
		
		int gop = 0;
		while(gop <= 9) {
			
			int dan = 2; // 반복 시 원래의 2로 돌아ㅘ야 함
			while(dan <= 9) {
				if(gop == 0) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
				
				dan++;
			} 
			System.out.println();
			gop++;
		}

	}	
}
