package Day13;

import java.util.Scanner;

public class 수강관리프로그램 {

	public static void main(String[] args) {
		/*Subject s = new Subject("대학교수", "MSC001","이순신",4,4,2020,"2학기","공통필수","월1A,월1B,수1A,수1B");
				System.out.println(s);		
		Student std = new Student("홍길동","010101-1111111","202012122","컴퓨터공학부","소프트웨어과", 2);
		std.insertSubject(s);
		std.print();
		System.out.println("----------");
		std.insertSubject(new Subject("대학영어", "MSC002","ㄱㄱㄱ",4,4,2020,"2학기","공통필수","월1A,월1B,수1A,수1B"));
				std.print();
				System.out.println("----------");
				std.deleteSubject("대학교수");
				std.print();
//		Student S = new Student("1","홍싱동","2학년","88점","3학기");
//				System.out.println(S);	
	}
}*/
		StudentManager sm = new StudentManager();
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		do {
			sm.printMenu();
			menu = scan.next().charAt(0);
			switch(menu){
			case '1' : sm.insertStudent(scan);; break;
			case '2' : sm.printStudent();; break;
			case '3' : sm.searchStudent(scan);; break;
			case '4' : sm.registerSubject(scan);; break;
			case '5' : sm.deletesubject(scan);; break;
			case '6' : break;
			default:
				sm.printAlert();
			}
		}while(menu !='6');
			sm.printExit();
			scan.close();
	}
}
/* 과목 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요.
 * 과목클래스의 필요한 멤버 변수/ 메소드를 생성하세요.
 *  - 멤버 변수 : char = 과목명, 과목코드, 교수명, 학점, 년도, 학기
 *  - 멤버 메소드 : getter/setter, toString()
 */

///* Student(학생) 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요.
// *  - 학생클래스 : 학생 1명의 정보를 나타내는 클래스
// *  - 멤버 변수 : 학생수, 학생이름, 학년, 시험점수, 학기
// *  - 멤버 메소드 : getter/setter, toString()
// */