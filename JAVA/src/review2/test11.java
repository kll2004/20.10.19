package review2;

import java.util.ArrayList;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		/*
		 * 단어장 프로그램을 작성
		 * 1.단어 등록
		 * 2.단어 검색
		 * 3.단어 수정
		 * 4.단어 출력
		 * 5.종료
		 * */				
		Scanner scan = new Scanner(System.in);
		ArrayList<word> list = new ArrayList<word>();
		System.out.println("=============================");
		System.out.println("선택할 항목");
		System.out.println("1.단어 등록");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 출력");
		System.out.println("5.종료");
		System.out.println("=============================");
		
		int menu = scan.nextInt();
		if(menu == 1){
			System.out.print("단어 등록: ");
//			String rg = scan.next();
		}
		else if(menu ==2){
			System.out.print("단어 검색: ");
//			String search = scan.next();
		}else if(menu ==3){
			System.out.print("단어 수정: ");
//			String change = scan.next();
		}else if(menu ==4){
			System.out.print("단어 출력: ");
//			String output = scan.next();
		}else{
			System.out.print("종료");
//			String end = scan.next();
		}
		scan.close();
	}
}