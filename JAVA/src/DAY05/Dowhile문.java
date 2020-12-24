package DAY05;

public class Dowhile문 {

	public static void main(String[] args) {
		/* for문과 while문은 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * do{
		 *    실행문 ; 
		 * }while(조건식);
		 *  - do while문은 조건식이 거짓이어도 무조건 1번은 싱행된다.
		 * */
		int i = 1;
		for( ; i==0;) {
			System.out.println(1);
		}
		do {
			System.out.println(2);
		}while(i==0);
		}

	}

