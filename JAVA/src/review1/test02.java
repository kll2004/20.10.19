package review1;

public class test02 {

	public static void main(String[] args) {
	}
}
class point{
	//멤버변수 : 정보
	private int x,y;
	//멤버메소드 : 기능

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//생성자 : 멤버변수 초기화
	//기본 생성자
	public point() {}
	//생성자 오버로딩
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//복사 생성자
	public point(point pt) {
			x = pt.x;
			y = pt.y;
		}
	}