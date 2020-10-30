package Day10;

public class 상속5 {

	public static void main(String[] args) {
//      만약 Child 클래스가 Parent1과Parent2 모두상속이 가능하다면 아래처럼
//		Print()라는 메소드를 실행했을 때 Parent1과Parent2중
//		누구의 메소드를 실행해야할지 모르기 떄문에 부모가 2개이상이 될 수 없다.
		
//		Child c= new Child();
//		c.print();
	}

}
class Parent1{
	void print() {
		System.out.println("부모1입니다.");
	}
}
class parent2{
	void print() {
		System.out.println("부모2입니다.");
	}
}
//class Child extends Parent1, Parent2{
//	
//}