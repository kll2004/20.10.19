package review2;

public class test05 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		t.voldown();
		t.chDown();
		t.printInfo();
		t.chChange(60);
		t.printInfo();
	}
}
/*
 * - 인터페이스
 *  - 추상 메소드와 클래스 상수만 있는 것
 *  - 추상메소드 : 메소드가 선언만 되어 있는 메소드(구현x)
 *  - 클래스 상수 : static(클래스), final(상수)
 *  
 *  구현 클래스 : 인터페이스를 구현한 클래스
 *   - 인터페이스에 있는 추상 메소드를 반드시 오버라이딩을 해야한다.
 * */
interface RemoteController{
	void turnOn();
	void turnOff();
	void chUp();
	void chDown();
	void chChange(int ch);
	void volup();
	void voldown();
}
class Tv implements RemoteController{
	private boolean power=false;
	private int vol = 6;
	private int ch = 1;
	private final int MAX_VOL = 10;
	private final int MAX_CH = 125;
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	@Override
	public void turnOn() {	power = true;}
	@Override
	public void turnOff() {	power = true;}
	@Override
	public void chDown() {
		if(power) {
			ch--;
		}
		if(ch<1) {
			ch = MAX_CH;
		}
	}
	@Override
	public void volUp() {
		if(power) {
			vol++;
		}
		if(vol>MAX_VOL) {
			vol = MAX_VOL;
		}
	}
	public void printInfo() {
		if(power) {
			System.out.println(+ch);
			System.out.println("vol : ");
			for(int i = 0; i<vol; i++) {
				System.out.println('■');
			}
			for(int i = 0; i<MAX_VOL-vol; i++) {
				System.out.println('□');
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
}