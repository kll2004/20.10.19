package DAY09;

public class 메소드6 {
	

	public static void main(String[] args) {
		System.out.println(calc(1,'+',2));
		System.out.println(calc(1,'-',2));
		System.out.println(calc(1,'*',2));
		System.out.println(calc(1,'/',2));

		System.out.println(random(1.5,'+',2.0));
		System.out.println(random(1.5,'-',2.0));
		System.out.println(random(1.5,'*',2.0));
		System.out.println(random(1.5,'/',2.0));
		System.out.println(random(1.5,'%',2.0));
		
	}
/* 기능 : 두 정수의 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를 알려주는 메소드
 * 매개변수 : 두 정수, 산술 연산자 => int num1,int num2, char op
 * 리턴타입 : 산술연산결과=> 실수(/떄문에)=>double
 * 메소드명 : calc*/
	public static double calc(int num1,char op, int num2) {
		switch(op) {
		case'+' : return num1 + num2;
		case'-' : return num1 - num2;
		case'*' : return num1 * num2;
		case'/' : return (double)num1 / num2;
		case'%' : return num1 % num2;
		}
		return 0;
	}
	/* 기능 ㅣ 두 실수의 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를 알려주는 메소드
	 * 매개변수 : 두 실수, 산술 연산자 => int num1,int num2, char op(1.15, 0.15)
	 * 리턴타입 : 산술연산결과=> 실수(/떄문에)=>double
	 * 메소드명 : random
	 * */
	public static double random(double num3,char op, double num4) {
		switch(op) {
		case'+' : return num3 + num4;
		case'-' : return num3 - num4;
		case'*' : return num3 * num4;
		case'/' : return num3 / num4;
		case'%' : return num3 % num4;
		}
		return 0;
	}
}

