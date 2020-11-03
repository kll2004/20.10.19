package Day12;

public class Warpper클래스 {

	public static void main(String[] args) {
		/* Warpper클래스는 기본 자료형을 클래스로 변환한 것
		 * 차이점
		 *  - 래퍼클래스는 null을 허용, 기본 자료형은 null을 하용하지 않음
		 *  - 래퍼 클래스는 기능(메서드)을 제공
		 * 
		 * int num = null;
		 * 기본 자료형은 null을 사용할 수 없음
		 *  
		 * */
		//num2는 주소
		Integer num2 = null;
		num2 = Integer.parseInt("1234");
		System.out.println(num2);		
		num2 = Integer.valueOf("5678");
		System.out.println(num2);
		num2 = Integer.valueOf("FF",16);
		System.out.println(num2);
		int num3 = num2; //언박싱
		System.out.println(num3);
		num2 = 23; //오토박싱
	}

}
