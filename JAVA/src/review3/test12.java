package review3;

public class test12 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 : 추상 메소드, 클래스 상수만 있는것
		 *  - 만드는시기 : 기능이 많은 경우 기능들만 미리 보고싶을 때(메소드명, 매개변수, 리턴타입을 확인할 경우)
		 *  - 사용시기 : 해당 기능들을 구현, 라이브러리에서 제공하는 메소드 중 일부가 인터페이스를 구현한 클래스를 필요할 때(Collections.sort)
		 *  인터페이스는 인터페이스만으로 객체를 만들 수 없다.
		 *  인터페이스는 인터페이스를 구현한 구현 클래스가 있어야 한다.
		 * */
		Controller c = new Tv();
		Point p = new Point();
		Tv t = new Tv();
	}
}
interface Controller{
	void start();
	void stop();
	void resume();
	void next();
	void prev();
}
class Point{
	int x,y;
}
class Tv implements Controller{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prev() {
		// TODO Auto-generated method stub
		
	}
	
}