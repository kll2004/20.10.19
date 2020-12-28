//package review3;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class board_main {
//	private static Scanner scan = new Scanner(System.in);
//			/*
//			 * 1. 게시글 등록
//			 * 2. 게시글 조회
//			 * 3. 게시글 수정
//			 * 4. 게시글 삭제
//			 * 5. 게시글 목록
//			 * 6. 종료
//			 * 번호 제목 작성자 작성일
//			 * 게시글
//			 *  - 번호, 제목, 내용, 작성자, 작성일
//			 * */
//	public static void main(String[] args) {
////		ArrayList<post> list = new ArrayList<post>();
//		int board;
//		do {
//			print();
//			board = scan.nextInt();
//			switch(board){
//			case 1:
//				System.out.println("게시글 등록");
//				insert();
//				break;
//			case 2:
//				System.out.println("게시글 조회");
//				search();
//				break;
//			case 3:
//				System.out.println("게시글 수정");
//				change();
//				break;
//			case 4:
//				System.out.println("게시글 삭제");
//				delete();
//				break;
//			case 5:
//				System.out.println("게시글 목록");
//				list();
//				break;
//			case 6:
//				System.out.println("종료");
//				break;
//			}
//		}while(board != 6);
//	}
//	
//	private static void print() {
//		System.out.println("=============================");
//		System.out.println("1.게시글 등록");
//		System.out.println("2.게시글 조회");
//		System.out.println("3.게시글 수정");
//		System.out.println("4.게시글 삭제");
//		System.out.println("5.게시글 목록");
//		System.out.println("6.종료");
//		System.out.println("=============================");
//		System.out.print("선택 : ");
//	}
//	private static void insert() {
//		board tmp = new board(null,null);
//		System.out.println("번호");
//		System.out.println("제목");
//		System.out.println("내용");
//		System.out.println("작성자");
//		System.out.println("작성일");
////		board tmp = new board(null,null);
////		System.out.println("단어 등록 : ");
////		System.out.print("단어 : ");
////		tmp.setWord(scan.next());
////		System.out.print("의미 : ");
////		tmp.setMean(scan.next());
////		list.add(tmp);
//	}
//	private static void search() {
//		System.out.println("조회할 게시글 : ");
//	}
//	private static void change() {
//		System.out.println("수정할 게시글 : ");
//	}
//	private static void delete() {
//		System.out.println("삭제할 게시글 : ");
//	}
//	private static void list() {
//		System.out.println("게시글 목록");
//	}
//}
