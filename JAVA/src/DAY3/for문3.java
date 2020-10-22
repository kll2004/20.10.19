package DAY3;

public class for문3 {

	public static void main(String[] args) {
		/*1부터 100까지 2의 배수들을 출력하는 예제
		 * */
		int num;
		for(num = 2; num <= 100; num = num +2) {
			System.out.print(num + " ");
			if(num % 50 == 0) {
				System.out.println();
			}
			

	}
	}
}
