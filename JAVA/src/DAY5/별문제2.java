package DAY5;

public class 별문제2 {

	public static void main(String[] args) {
		/*for(초기화 ; 조건식; 증감연산식){
		 *    실행문
		 *    
		 * - 일반변수 vs 참조변수
		 * - 일반변수는 변수타입(자료형)을 이용한 변수들 값을 저장
		 * - 참조변수는 주소를 저장하는 변수로, 객채, 배열 등인 있다.
		 * - 지역변수 : 특정지역에서 사용하는 변수
		 * */

		/*     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 * */	
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*i
		 * i=1,공=0  *=9  8  4     *********
		 * i=2,공=1  *=7  6  3      *******
		 * i=3,공=2  *=5  4  2       *****
		 * i=4,공=3  *=3  2  1        ***
		 * i=5,공=4  *=1  0  0         *
		 *    공=i-1 *= 2곱하기(4)+1
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*(5-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
