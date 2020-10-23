package DAY5;

import java.util.Scanner;

public class while문1 {

	public static void main(String[] args) {
		/*while(조건식){
		 *    실행문;
		 * }
		 * 
		 * 초기화;
		 * while(조건식){
		 *    실행문;
		 *    증감식;
		 * }
		 *  - while문 조건시 생략 불가능
		 * */
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		int j = 1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		//짝수출력
		j = 1;
		while(j<=5) {
			if(j%2==1) {
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		
		/*for문은 차례대로 증가하는 경우=>증감연산식이 곡 필요한 경우
		 * while문은 입력받은 값을 이용하여 반복문은 유지하는 경우
		 * */
		int menu = 4;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("---메뉴***");
			System.out.println("1.불러오기");
			System.out.println("2.저장하기");
			System.out.println("3.실행하기");
			System.out.println("4.종료하기");
			System.out.println("--------");
			System.out.println("메뉴를 선택하세요");
			menu = scan.nextInt();
		}while(menu != 4);
		System.out.println("v프로그램 종료");
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
