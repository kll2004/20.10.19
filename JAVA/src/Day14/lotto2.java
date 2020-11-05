/*package Day14;

import java.util.Scanner;

public class lotto2 {

	public class StudentManager implements Program {
		private Student [] std = new Student[10];
		private int studentCount;
		@Override
		public void print() {
			for(int i = 0; i<studentCount; i++) {		
				printStudentOne(std[i]);
			}
		}
		@Override
		public void insertStudent(Scanner scan) {
			//학생 1명의 정보를 입력받아 객체에 저장
			System.out.println("-----------------");
			System.out.println("학생 정보를 입력하세요.");
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("주민번호: ");
			String rNum = scan.next();			
			int term = scan.nextInt();
			System.out.println("-----------------");
			Student s = new Student(name, rNum,term);
			//저장한 객체를 배열에 추가
			if(std.length == studentCount) {
				//학생 배열이 꽉차면 학생 배열을 늘려주는 작업
				Student [] tmp = new Student[studentCount+10];
				System.arraycopy(std, 0, tmp, 0 ,std.length);
				std = tmp;
				std[studentCount] = s;
				studentCount++;
			}
		}
		@Override
		public void searchStudent(Scanner scan) {
			//검색할 이름을 입력
			System.out.println("검색할 이름 입력 : ");
			String tmpname = scan.next();
			//학생 배열에 해당 이름과 일치하는 학생 있는지 검색(반복문을 이용)
			for(int i = 0; i< studentCount; i++) {
				if(tmpname.equals(std[i].getName())){
					printStudentOne(std[i]);
				}
			}
			//향상된 반복문을 사용하기위한 조건 : 배열, 전체 탐색
		}
		//예시 : 홍길동 학생이 대학수학을 수강 신청했을 때 동작해야하는 메소드
		@Override
		public void registerSubject(Scanner scan) {
			
			System.out.print("학번을 입력 : ");
			String sNum = scan.next();
//			학생 정보를 검색하여 학생이 있는지 확인
			int index = -1;
			for(int i = 0; i <studentCount; i++) {
				if(std[i].getStudentNum().equals(sNum)) {
					index = i;
					break;
				}
			}
			if(index == -1) {
				System.out.println("존재하지 않는 학생입니다.");
				return;
			}
			System.out.println("과목명 : ");
			String sTitle = scan.next();
			Subject subject = new Subject(sTitle);
			std[index].insertSubject(subject);
			}
		//학생정보(수강 신청한 학생 : 학번)를 입력
		//수강 과목을 입력, 학생 정보에 수강 과목을 추가
		public void deletesubject(Scanner scan) {		//이 이후에 과목코드, 담당교수등과 같은 나머지 정보도
			int index = -1;
			String sNum = scan.next();
			for(int i = 0; i <studentCount; i++) {
				if(std[i].getStudentNum().equals(sNum)) {
					index = i;
					break;
				}
			}
			if(index == -1) {
				System.out.println("존재하지 않는 학생입니다.");
				return;
			}
			//철회과목을 입력
			System.out.print("과목명 : ");
			String sTitle = scan.next();
			
			std[index].deleteSubject(sTitle);			
		}
		public void printMenu() {
				System.out.println("-----메뉴-----");
				System.out.println("1.학생등록");
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
		private void printStudentOne(Student s) {
		//private인 경우 내부적으로 사용할 경우
			System.out.println("----학생 정보----");
			System.out.println(s);
			System.out.println("---------------");
			System.out.println("----수강 정보----");
			s.print();
			System.out.println("---------------");
		}
	}
}
*/