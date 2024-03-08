
public class B00_format {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.printf("a의 값은 : %d",a);
		
		/*
		 *  정수 : %d
		 *  실수 : %f
		 *  한문자 : %c
		 *  문자열 : %s
		 *  각 제어문자와 대응한 값을 지정해야 함
		 */
		 
		 float b = 10.234f;
		 char c = 'A';
		 String str = "오늘 날씨는 미세먼지가 많다";
	
		 System.out.printf("\na의 값은 정수 %d, b의 값은 실수 %f \nc의 값은 문자 %c, str의 값은 문자열 %s",a,b,c,str);
		
	}
	
}
		