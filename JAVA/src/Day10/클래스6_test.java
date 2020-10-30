package Day10;

public class 클래스6_test {

	public static void main(String[] args) {
		GreencomputerStudent [] std = new GreencomputerStudent[10];
		std[0] = new GreencomputerStudent("홍길동", "2002-05-01", 19, "010-1234-5678", "청주");
		std[0].printinfo();
		std[0].printCompany();
		std[0].printcourse();
		std[0].insertcourse("디지털컨버전스 JAVA 양성과정", "2020.10.19-2021.04.01");
		std[0].printcourse();
		std[1]=new GreencomputerStudent("임씨","서울");
		std[2]=new GreencomputerStudent("유씨","청주");
		std[3]=new GreencomputerStudent("이씨","의정부");
		//학색들 중에 이씨 학생이 있는지 검색
		String searchname = "이씨";
		for(GreencomputerStudent tmp  :std) {
			if(tmp != null && tmp.getName().equals(searchname)) {
				System.out.println("----------");
				tmp.printinfo();
				System.out.println("----------");
			}			
		}
		String searchname1 = "유씨";
		for(GreencomputerStudent tmp  :std) {
			if(tmp != null && tmp.getName().equals(searchname1)) {
				System.out.println("----------");
				tmp.printinfo();
				System.out.println("----------");
			}
			
		}	
	}

}
/* - 학생기본정보 : 학생이름, 생년월일, 나이, 전화번호
 * - 학원 정보 : 학원이름, 지점
 * - 학생수강정보 : 수강과목, 기간
 * - 학생기본 정보출력 
 * - 학생의 학원정보 출력 기능
 * - 학생 수강 정보 출력 기능
 * - 학생 수강 정보 추가 기능
 * - 생성자
 * */
class GreencomputerStudent{
	private String name;
	private String birthday;
	private int age;
	private String phoneNumber;
	final static public String company = "그린컴퓨터아트학원";
	private String branch;
	private String []cpurse;
	private String []period;
	private String[] course;
	private int courseCount;

	
	public GreencomputerStudent(String name, String birthday, int age, String phoneNumber, String branch) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.branch = branch;
		this.course = new String[10];
		this.period = new String[10];
	}// Ctrl+shift+S => using fields
	public GreencomputerStudent(String name, String branch) {
		this(name, null, 0, null, branch);
	}
	public void printinfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("생일 : " + birthday);
	}
	public void printCompany() {
		System.out.println("학원명 : " + company);
		System.out.println("지점명 : " + branch);
	}
	public void printcourse() {
		if(course == null || course.length == 0||courseCount == 0) {
			System.out.println("수강이력이 없습니다.");
			return;
		}
		for(int i=0;i< courseCount;i++) {
			System.out.println("과정 : " + course[i]);
			System.out.println("기간 : " + period[i]);
		}
	}
	public void insertcourse(String course, String period) {
		this.course[courseCount] = course;
		this.period[courseCount] = period;
		courseCount++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCpurse() {
		return cpurse;
	}
	public void setCpurse(String[] cpurse) {
		this.cpurse = cpurse;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	
}


//public void class GreencomputerStudent{
//
//	
//	int arr[] = int; 
//	public void 지각() {
//		pass = true;
//	}
//	public void 결석() {
//		pass = true;
//	}
//	public void printpower() {
//		if(pass) {
//			System.out.println("지각");
//		}else {
//			System.out.println("결석");
//		}
//	}
//	}
//}
