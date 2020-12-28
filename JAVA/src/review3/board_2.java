package review3;

import java.util.ArrayList;
public class board_2 {

	public static void main(String[] args) {
		ArrayList<A> list = new ArrayList<A>();
		for(int i = 0; i<5; i++) {
			A tmp = new A();
			list.add(tmp);
			System.out.println(tmp);
		}
		System.out.println("------------------------");
		for(A tmp : list) {
			System.out.println(tmp);
		}
	}

}
class A{
	static int count = 0;
	int num;
	public A() {
		count ++;
		num = count;
	}
	public String toString() {
		return "번호 : " + num + "생성된 객체 수 : " + count;
	}
}