package Day10;


public class 상속2 {
	/* 오버라이딩 : 부모클래스에게 물려받은 메소드를 재정의하는 것
	 *  - 부모 클래스의 메소드와 일치해야한다
	 *  - 접근제한자는 같건 넚은 접근제한자를 써야한다.
	 *    => 범위를 축소할 수 없다.
	 * */

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.info();
		t1.howl();
		Dog d1 = new Dog();
		d1.info();
		d1.howl();
	}
}
class Animal{
	private String name;
	private String category;
	void info() {
		System.out.println("----------");
		System.out.println("이름 : " +  name);
		System.out.println("분류 : " + category);
		System.out.println("----------");
	}
	public void howl() {
		System.out.println("울음소리");
	}
	public String getName() {
		return name;
	}
	public String setName() {
		return name;
	}
	public Animal(String name, String category) {
	}
	public Animal() {}
}

class Tiger extends Animal{
	public Tiger(){
		/*super는 부모를 가르키는 참조변수, super()는 부모 클래스의 생성자 */
		super("호랑이", "고양이과");
		//setCategory("고양이과");
		//setName("호랑이");
	}
	@Override
	public void howl() {
		System.out.println("울음소리 : 어흥");
	}
}
class Dog extends Animal{
	public Dog() {
		super("개","개과");
	}
	@Override
	public void howl() {
		System.out.println("울음소리 : 멍멍");
	}
}