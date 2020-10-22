package DAY4;

import java.util.Scanner;

public class Break문 {

	public static void main(String[] args) {
		/*braek : 반복문을 빠져 나오게 하는 키워드
		 *  - braek는 반듯이 조건문을 동반한다.
		 *  - break를 만나면 반복문을 빠져 나감
		 * */
		
		
		int i;
		for(i =1; ; i++) {
			System.out.println(i);
			if(i==10) {
		      break;	
			}
		}
		
		Scanner scan = new Scanner(System.in);
		char ch;
		for(; ;) {
			System.out.println("문자를 입력하세요(종료하려면 y나 n를 입력) : ");
			ch = scan.next().charAt(0);
			if(ch =='y'|| ch == 'y')
				break;
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
