package DAY3;

public class For문2 {

	public static void main(String[] args) {
		/*1부터 10까지 합
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 *  - 초기화 : i는 1부터
		 *  - 조건식 : i는 10까지 => i는 10보다 작거나 같다
		 *  - 증감연산식 : i는 1씩 증가
		 *  - 규칙성 : sum = sum +1
		 *  - 반복문 종료 후 : sum을 출력 
		 *  
		 *       sum0 = 0
		 *  i=1, sum1 = 0 + 1
		 *  i=2, sum2 = 0 + 1 + 2
		 *  i=3, sum3 = 0 + 1 + 2 + 3 
		 *  ....
		 *  i=10, sum10 = 0 + 1 + 2 + 4 +5.....+10
		 */
		int i, sum;
		for(i = 1, sum = 0; i <=10 ; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		for(i = 1, sum = 0; i <=10 ; i = i+2) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지 홀수의 합 : " + sum);
			
			
			
			
			
			
			
	}

}
