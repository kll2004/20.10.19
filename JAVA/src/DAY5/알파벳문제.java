package DAY5;

public class 알파벳문제 {

	public static void main(String[] args) {
		/*A부터Z까지 반복문을 이용하여 출력하는 예제
		 * */
		
		for(char ch='A';ch<='Z'; ch++) {
			System.out.print(ch);
		}
		/* A
		 * AB
		 * ABC
		 * ABCD
		 * .......
		 * ABCD..XYZ 
		 * */
				
		for(char ch1='A';ch1<='Z'; ch1++) {
			for(char ch2 = 'A'; ch2<=ch1; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
