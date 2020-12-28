package review3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class word_main2 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * 단어장 프로그램을 작성
		 * 1.단어 등록
		 * 2.단어 검색
		 * 3.단어 수정
		 * 4.단어 출력
		 * 5.종료
		 * */	
		int menu;
		ArrayList<word> list = new ArrayList<word>();
		do {
			printMenu();
			menu = scan.nextInt();
			word tmpword;
			switch(menu){
			case 1:
				System.out.println("단어 등록");
				insertword(list);
				//등록할 단어와 뜻을 입력
				//단어장에 단어를 등록
				break;
			case 2:
				System.out.println("단어 검색");
				//검색할 단어를 입력
				tmpword = inputword();
				searchword(list, tmpword);
				//단어장에서 단어를 검색
				break;
			case 3:
				//수정할 단어를 입력
				//단어가 있는지 의미를 입력, 없으면 없다고 출력, 단어장에서 해당 단어를 수정
				System.out.println("단어 수정");
				tmpword = inputword();
				modifyword(list,tmpword);
				//단어에 대한 새로운 뜻을 입력받아 단어장에서 해당 단어를 수정
				break;
			case 4:
				//단어장 정렬
				//단어장에있는 모든 단어를 출력
				printword(list);
				System.out.println("단어 출력");
				break;
			case 5:
				System.out.println("종료");
				break;
			default :
				System.out.println("잘못된 메뉴");
			}
		}while(menu != 5);
	}
	private static void printMenu() {
		System.out.println("=============================");
		System.out.println("선택할 항목");
		System.out.println("1.단어 등록");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 출력");
		System.out.println("5.종료");
		System.out.println("=============================");
		System.out.print("메뉴선택(1~5) : ");
		
	}
	/* 기능 : 단어장에 단어를 등록하는 메소드
	 * 매개변수 : 단어장=>ArrayList<word> list
	 * 리턴타입 : void
	 * 메소드명 : insertword
	 * */
	private static void insertword(ArrayList<word> list) {
		word tmp = new word(null,null);
		System.out.println("단어 등록 : ");
		System.out.print("단어 : ");
//		String str = scan.next();
//		tmp.setWord(str);
		tmp.setWord(scan.next());
		System.out.print("의미 : ");
		tmp.setMean(scan.next());
		list.add(tmp);
	}
	/* 기능 : 검색/수정할 단어를 입력받는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 단어 => word
	 * 메소드명 : inputFullword
	 * */
	private static word inputword() {
		System.out.println("단어입력");
		word tmp = new word(null,null);
		System.out.println("단어 : ");
		tmp.setWord(scan.next());
		return tmp;
	}
	/* 기능 : 단어장에 단어를 검색하여 콘솔에 풀력하는 메소드
	 * 매개변수 : 단어장, 단어 > ArrayList<word> list, word word
	 * 리턴타입 : 없음>void
	 * 메소드명 : searchword
	 * */
	private static void searchword(ArrayList<word> list, word word) {
//		for(int i = 0; i<list.size(); i++) {
//			word tmp = list.get(i);
//			if(tmp.equals(word.getWord())) {
//				System.out.println("============");
//				System.out.println(tmp);
//				System.out.println("============");
//				return;
//			}
//		}
		for(word tmp : list) {
			if(tmp.equals(word.getWord())) {
				System.out.println("=====검색결과=======");
				System.out.println(tmp);
				System.out.println("============");
				return;
			}
		}
		System.out.println("해당 단어가 없습니다.");
	}
	/* 기능 : 단어 뜻을 입력받아 해당 단어를 단어장에서 수정하는 메소드
	 * 매개변수 : 단어장, 단어 > ArrayList<word> list, word word
	 * 리턴타입 : 수정 여부 > boolean
	 * 메소드명 : modifyword
	 * */
	private static boolean modifyword(ArrayList<word> list, word word) {
		//검색해서 있으면 삭제, 없으면 종료
		int size = list.size();
		for(int i = 0; i<list.size(); i++) {
			word tmp = list.get(i);
			if(list.get(i).equals(word.getWord())) {
				list.remove(i);
				break;
			}
		}
		if(size == list.size()) {
			System.out.println("============");
			System.out.println("해당 단어가 없습니다.");
			System.out.println("============");
			return false;
		}
		//뜻을 입력
		System.out.println("의미 : ");
		word.setMean(scan.next());
		//수정된 단어 word를 단어장 list에 추가
		list.add(word);
		return true;
	}
	/* 기능 : 단어장에 있는 단어들을 정렬하는 메소드
	 * 매개변수 : 단어장 > ArrayList<word> list
	 * 리턴타입 : 없음 > void
	 * 메소드명 : sortword
	 * */
	private static void sortword (ArrayList<word> list, word word) {
		Collections.sort(list);
	}
	/* 기능 : 단어장에 있는 단어들을 출력하는 메소드
	 * 매개변수 : 단어장 >ArrayList<word> list
	 * 리턴타입 : void
	 * 메소드명 : printword
	 * */
	private static void printword (ArrayList<word> list) {
		for(word tmp : list) {
			System.out.println(tmp);
		}
	}		
}





















