package reivew1;

public class test01 {

	public static void main(String[] args) {
		/* '' : 문자, "" : 문자열 */
		System.out.println("hell world");
		/* 변수이름이 num이고 정수10을 num에 저장하고, 콘솔에 출력하세요. */
		int num = 10;
		System.out.println(num);
		/* 문자열 str1에 hello를 문자열 str2에 hi를 저장한 후 두 문자열의 같은 문자열인지 비교하는 코드를 작성하세요.*/
		String str1 = "hello";
		String str2 = "hi";
		if(str1.equals(str2)) {
			System.out.println(str1+','+str2+"는 같다");
		}else {
			System.out.println(str1+','+str2+"는 다르다");
		}
	}

}
