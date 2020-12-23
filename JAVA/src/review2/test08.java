package review2;

import java.util.ArrayList;
import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		/*정수 n을 입력 받고 입력받은 수만큼 단어와 뜻을 입려받아 저장하고 출력하는 코드를 작성하세요.*/
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();		
		System.out.print("정수입력 : ");
		int num = scan.nextInt();
		while(list.size()<num) {
			System.out.print("단어 : ");
			String str = scan.next();
			list.add(str);
			System.out.print("뜻 : ");
			String str2 = scan.next();
			list.add(str2);
		}
		for(String tmp : list) {
			System.out.println(tmp);
		}
	}
}