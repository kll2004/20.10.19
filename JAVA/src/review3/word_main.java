package review3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class word_main {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
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
				break;
			case 2:
				System.out.println("단어 검색");
				tmpword = inputword();
				searchword(list, tmpword);
				break;
			case 3:
				System.out.println("단어 수정");
				tmpword = inputword();
				modifyword(list,tmpword);
				break;
			case 4:
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
	private static void insertword(ArrayList<word> list) {
		word tmp = new word(null,null);
		System.out.println("단어 등록 : ");
		System.out.print("단어 : ");
		tmp.setWord(scan.next());
		System.out.print("의미 : ");
		tmp.setMean(scan.next());
		list.add(tmp);
	}
	private static word inputword() {
		System.out.println("단어입력");
		word tmp = new word(null,null);
		System.out.println("단어 : ");
		tmp.setWord(scan.next());
		return tmp;
	}
	private static void searchword(ArrayList<word> list, word word) {
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
	private static boolean modifyword(ArrayList<word> list, word word) {
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
		System.out.println("의미 : ");
		word.setMean(scan.next());
		list.add(word);
		return true;
	}
	private static void sortword (ArrayList<word> list, word word) {
		Collections.sort(list);
	}
	private static void printword (ArrayList<word> list) {
		for(word tmp : list) {
			System.out.println(tmp);
		}
	}		
}