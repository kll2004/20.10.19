package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String subject = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		do {
			print();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				insert(scan, map);
			break;
			case 2: 
				print(map);
				break;
			case 3:
				print(map,scan);
			break;
			case 4: 
				modify(map, scan);
			break;
			case 5: break;
			default :
			System.out.println("잘못된 메뉴");
			}		
		}while(menu !=5);
		System.out.println("프로그램 종료");
	}
	public static void print() {
		System.out.println("----------메뉴----------");
		System.out.println("1. 학생 성적 추가");
		System.out.println("2. 학생 성적 조회(전체)");
		System.out.println("3. 학생 성적 조회(과목)");
		System.out.println("4. 학생 성적 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("----------메뉴----------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	public static void insert(Scanner scan,HashMap< String, Integer>map) {
		System.out.println("과목 성적을 입력하세요(예시 : 영어 100) : ");
		String subject = scan.next();
		int score = scan.nextInt();
		if(map.get(subject) ==null) {
			map.put(subject, score);
		}else {
			System.out.println(subject + "는 이미 추가한 과목");
		}
	}
	public static void print(HashMap< String, Integer>map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp + " : " + map.get(tmp));
		}	
	}
	public static void print(HashMap< String, Integer>map, Scanner scan) {
		System.out.println("조회할 과목 입력 : ");
		String subject = scan.next();
		Integer tmp = map.get(subject);
		if(tmp == null) {
			System.out.println("없는 과목");
		}else {
			System.out.println(subject + " : " + tmp);
		}
	}
	public static void modify(HashMap< String, Integer>map, Scanner scan) {
		System.out.println("과목 성적을 입력하세요(예시 : 영어 100) : ");
		String subject = scan.next();
		int score = scan.nextInt();
		Integer tmp2 = map.get(subject);
		if(tmp2 ==null) {
			System.out.println("는 없는 과목이라 수정할 수 없음");
		}else {
			map.put(subject, tmp2);
			System.out.println(subject + "성적이 수정됨");
		}
		
	}
		/*한 학생의 성적을 관리하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 학생 성적 추가
		 * 2. 학생 성적 조회(전체)
		 * 3. 학생 성적 조회(과목)
		 * 4. 학생 성적 수정
		 * 5. 프로그램 종료
		 * 
		 * ---------------------------------------------------------------------------
		 * 
		 * 5번 메뉴를 선택하기 전까지 반복
		 * 메뉴출력
		 * 메뉴를 선택 : 메뉴를 입력
		 * 입력받은 메뉴에 따라 기능 처리 : switch문
		 * 
		 * 1번기능 : 학생 과목과 성적을 입력받고, 입력바은 정보를 map에 추가
		 * 2번기능 : map에 있는 정보를 출력
		 * 3번기능 : 과목에 입력받고, 입력받은 과목의 성적을 출력
		 * 4번기능 : 과목과 성적을 입력받고, 입력받은 성적으로 수정
		 * */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1. 학생 성적 추가");
//		System.out.println("2. 학생 성적 조회(전체)");
//		System.out.println("3. 학생 성적 조회(과목)");
//		System.out.println("4. 학생 성적 수정");
//		System.out.println("5. 종료");
//		System.out.println("메뉴를 선택하세요 : ");
//		int menu = 0;	
//		do {
//			lm.printMenu();
//			menu = scan.nextInt();
//			switch(menu) {
//			case 1: Student Score1;
//				lm.scan);
//				break;
//			case 2: Student Score2;
//				lm.();
//				break;
//			case 3: Student Score3;
//				lm.(scan);
//				break;
//			case 4: Student Score4;
//				lm.();
//				break;
//			case 5: break;
//			default :
//				lm.printString("잘못된 메뉴");
//			}
//		}while(menu !=5);
//		lm.printString("프로그램 종료");
//	}
}

