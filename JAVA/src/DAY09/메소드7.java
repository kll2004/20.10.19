package DAY09;

public class 메소드7 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fac(5));
	}
	/* 재귀 메소드 : 메소드A안에 메소드A를 호출하는 메소드(드믈게 사용)
	 * 5! = 5 * 4 * 3 * 2 * 1
	 *    = 5 * 4!
	 * 4! = 4 * 3 * 2 * 1
	 *    = 4 * 3! 
	 * 0! = 1
	 * 
	 * 기능 : 양수가 주어지면 주어진 양수의 팩토리가 값을 알려주는 메소드
	 * 매개변수 : 양수 정수 int num
	 * 리턴타입 : 팩토리 값 => 정수 int
	 * 메소드명 : factorial */
	public static int factorial(int num) {
		if(num < 0 ) {
			return 0;
		}
		if(num ==0 || num ==1) {
			
			return 1;
		}
		return num * factorial(num-1);		
	}
	public static int fac(int num) {
		if(num < 0 ) {
			return 0;
		}
		int res = 1;
		if(num ==0 || num ==1) {
			
			return 1;
		}
		return num * fac(num-1);		
	}
	
}
