package Day13;

import java.util.Scanner;

/* - 모든 학생정보 출력기능
 * - 학생등록기능
 * - 학생검색기능
 * - 수간등록기능
 * - 수강철회기능
 * */
public interface Program {
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deletesubject(Scanner scan);
}