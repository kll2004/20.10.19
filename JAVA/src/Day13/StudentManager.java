package Day13;

import java.util.Scanner;

public class StudentManager implements Program {
	private Student [] std = new Student[10];
	private int studentCount;
	@Override
	public void printStudent() {
		for(int i = 0; i<studentCount; i++) {
			System.out.println("----학생 정보----");
			System.out.println(std[i]);
			System.out.println("---------------");
			System.out.println("----수강 정보----");
			std[i].print();
			System.out.println("---------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		//학생 1명의 정보를 입력받아 객체에 저장
		System.out.println("-----------------");
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("이름 		: ");
		String name = scan.next();
		System.out.print("주민번호: ");
		String rNum = scan.next();
		System.out.print("학번 : ");
		String sNum = scan.next();
		System.out.print("학부 : ");
		String faculty = scan.next();
		System.out.print("학과 : ");
		String major = scan.next();
		System.out.print("학기 : ");
		int term = scan.nextInt();
		System.out.println("-----------------");
		Student s = new Student(name, rNum, sNum, faculty, major, term);
		//저장한 객체를 배열에 추가
		if(std.length == studentCount) {
			
		}else {
			std[studentCount] = s;
			studentCount++;
	}
	@Override
	public void searchStudent(scanner scan) {
		//조건문을 통한 등록학생 확인
		//
		//검색할 이름을 입력
		//학생 배열에 해당 이름과 일치하는 학생 있는지 검색
	}
	@Override
	public void registerSubject(scanner scan) {
	}
	@Override
	public void deletesubject(scanner scan) {		
	}
	public void printMenu() {
			System.out.println("-----메뉴-----");
			System.out.println("1.학생등록");
			System.out.println("2.학생확인");
			System.out.println("3.학생검색");
			System.out.println("4.수강신청");
			System.out.println("5.수강철회");
			System.out.println("6.종료");
			System.out.println("----------");
			System.out.print("메뉴 선택");
	}
	public void printAlert() {
		System.out.println("----------");
		System.out.println("잘못된 메뉴입니다.");
		System.out.println("----------");
	}
	public void printExit() {
		System.out.println("----------");
		System.out.println("프로그램 종료");
		System.out.println("----------");
	}
}
