package Day11;

public class 예외처리2 {

	public static void main(String[] args) {
		/* 아래 코드들은 예외가 발생할 수 있는 코드들*/
		int []arr = new int[5];
		//RuntimeException : 문법 오류 - 오타와 같이 자바 구문에 어긋난 코드 때문에 발생하고, 컴파일시에 발생하는 오류
		//                   실행 오류 - 프로그램 실행시 상황에 따라 발생하는 오류
//     ※ RuntimeException이 아닌 예외들은 try catch로 예외처리를 하지 않으면 에러가 발생 ※
		
		//ArrayIndexOutOfBoundsException : 배열의 주소가 길이를 넘어가는 경우
		//ArithmecticException : 0으로 나누는 경우
		//ClassCastException : 클래스의 형변환 과정에서 예외가 발생하는 경우
		//NullPointerException: 참조변수가 객체와 연결되지 않은 상태에서 멤버변수나 메소드에 접근하려는 경우
		P p = new P();				
		C c2 = null;		
	}
}
class P{
	void print() {}
}
class C extends P{
	void printChild() {}
}