package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// quiz 1
		System.out.println("quiz 1 : 1 ~ 101 미만의 임의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요. (3항 연산식을 사용)");
		
		int int1 = (int)(Math.random()*101);
		System.out.println("숫자 : " +int1);
		System.out.println("결과 : "+(int1 %2 == 0? "짝수" : "홀수"));
		System.out.println();
		
			
			
	   
		// quiz 2
		System.out.println("quiz 2 : -5 ~ 5 사이의 임의 정수를 생성하고, 삼항 연산식을 사용하여 절대값을 출력하세요.");
				
		int int2 = 5 - (int)(Math.random()*11);
		    System.out.println("숫자 : " +int2);
	    int abs = (int2 >= 0? int2 : -int2);
		System.out.println(int2+"의 절대값은 : " +abs);
		System.out.println();
		
		// quiz 3
		System.out.println("quiz 3 : 정수를 입력받아 그 수가 짝수 인지 홀수 인지 출력하는 프로그램을 작성하세요. (3항 연산식)");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int int3 = scan.nextInt();
		String result = int3 %2 == 0 ? "\"짝수\"" : "\"홀수\"";
		System.out.println("입력받은 수는 : "+result+" 입니다");
		System.out.println();
		
		
		// quiz 4
		System.out.println("quiz 4 : 키와 나이를 입력받아서 키는 140 이상, 나이는 8살 이상인 경우만 놀이기구에 탑승 할수 있는 프로그램을 작성하세요.");
		
		
		System.out.print("키를 입력하세요 : ");	
		int height = scan.nextInt();
		
		
		System.out.print("나이를 입력하세요 : ");	
		int age = scan.nextInt();
		
		if(height>=140) {
		} if(age>=8) {
				System.out.println("놀이기구에 탑승할 수 있습니다.");
			} else {
				System.out.println("놀이기구에 탑승할 수 없습니다.");
		}
		
		System.out.println();
		
	
		
		
		// quiz 5
		System.out.println("quiz 5 : 정수 두개를 입력받아서 큰 수를 출력, 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.");
		
	 
	    System.out.println("정수A를 입력하세요 : ");
	    int inta = scan.nextInt();
	    
	   
	    System.out.println("정수B를 입력하세요 : ");
	    int intb = scan.nextInt();
			
	    if(inta==intb) {
	    	System.out.println("숫자가 같습니다.");
	    } else if(inta>intb) {
	    	System.out.println("큰 수를 출력합니다. 정수A : "+inta);
	    } else {
	    	System.out.println("큰 수를 출력합니다. 정수B : "+intb);
	    }
		// quiz 6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수 를 구분하고, 0이면 0입니다. 를 출력
		// 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요
		
	    System.out.println("정수를 입력하세요. : ");
	    int int6 = scan.nextInt();
	    if(int6 > 0) {
	    	if(int6%2 ==0) System.out.println(int6 +"은 짝수입니다.");
	    	
	    	else System.out.println(int6+ "은 홀수입니다,");
	    } else if(int6 ==0) {
	    	System.out.println("입력한 정수는 0입니다.");
	    } else {
	    	System.out.println(int6+"은 음수입니다.");
	    }
	    
		// quiz 7
		// switch 를 사용하여 수박, 사과, 멜론, 포도, 귤을 구매 시 가격을 출력하는 프로그램을 작성하세요.
	 
	    System.out.println("수박, 사과, 멜론, 포도, 귤");
	    System.out.println("구매할 과일을 입력하세요 : ");

	    String friut = scan.next();
	    
	    switch(friut) {
	    case "수박":
	    System.out.println("수박의 가격은 10000원 입니다.");
	    break;
	    case "사과":
		    System.out.println("사과의 가격은 2000원 입니다.");
		    break;
	    case "멜론":
		    System.out.println("멜론의 가격은 3000원 입니다.");
		    break;
	    case "포도":
		    System.out.println("포도의 가격은 4000원 입니다.");
		    break;
	    case "귤":
		    System.out.println("귤의 가격은 5000원 입니다.");
		    break;
		    default:
		    	System.out.println("존재하지 않습니다.");
		    	
	    }
		
		scan.close();
		
	}
}			

