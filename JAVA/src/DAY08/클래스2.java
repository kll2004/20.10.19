package DAY08;

public class 클래스2 {

	public static void main(String[] args) {
//		Card c = new Card();
//		c.print();
//		//카드모양과 숫자 설정
//		c.setnum('나');
//		c.setShape('☆');
//		카드모양과 숫자를 출력하는 코드	
		Cardpack cp = new Cardpack();//86번으로 이동,Cardpack() 생성자대문에
		cp.shuffle();
		Card tmp;
		for(int i = 1 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= 13 ; j++) {
				tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}
	}
}
/*Card pack 클래스
 *- 카드팩 : 52장의 카드들 =>int
 *- 카드 석기 기능 => random
 *- 카드 빼내는 기능 => 마이너스
 *- 카드 초기화 기능 => 조건이 충족되면 초기화 된다.=>반복문 =>for
 * */
class Cardpack{
	private Card [] pack = new Card[52];
	private int cnt = 0;//현재남은 카드갯수	
	public void shuffle() {
		int min = 0;
		int max = pack.length-1;
		for(int i = 0; i<pack.length; i++) {
			int index = (int)((max - min +1)*Math.random() + min);
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;	
	}
}
	//리턴타입 : 꺼내간 카드 =>Card
	public Card pick() {
		if(cnt==0){
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	public void init() {
		cnt = 52;
		shuffle();		
	}
	public int getCnt() {
		return cnt;
	}
	public Cardpack() {
		char shape = '☆';
		for(int i = 1; i<=4; i++) {
			//i 값에 따라 카드 모양을 결정
			switch(i) {
			case 1 : shape = '☆'; break;
			case 2 : shape = '○'; break;
			case 3 : shape = '◎'; break;
			case 4 : shape = '◇'; break;
			}			
			for(int  j = 1 ; j<=13 ; j++) {
				//카드1장생성
				Card tmp = new Card();
				tmp.setNum(j);
				tmp.setShape(shape);
				//카드팩에 카드를 추가
				pack[cnt] = tmp;
				//카드팩에 들어있는 카드 갯수 증가
				cnt++;					
			}
		}		
	}	
}

/* Card클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * - 숫자 : 1~10, J, Q, K
 * - 문양 : 세잎, 하트, 클로버, 다이아
 * - 카드 정보 출력 기능
 * 
 * - 멤버 변수 : 클래스의 속성/정보
 * - 멤버메소드 : 클래스의 기능
 * - 생성자 : 클래스의 멤버 변수를 초기화하는 매소드라 생각하면 된다.
 * - 생성자 선언방법 ({
 *   } public void 클래스명(){
 *메소드
 * - 
 *  -세잎1~10, 하트1~10, 클로버1~10, 다이아1~10, J4가지, Q4가지, K4가지

class Card{
	public static int x;
	public static int y;	
	public static int Z;	
	private static int x1;
	private static int y1;
	private static int Z1;

	public static void print() {
		System.out.println("("+x+ "," +y+ "," +Z+")");
		System.out.println("("+x1+ "," +y1+ "," +Z1+")");
	}

	public void move(int x2 ,int y2) {
		x = x2;
		y = y2;
		x1 = x2;
		y1 = y2;
	}

	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void set1(int y1) {
		this.y1 = y1;
	}
	public int getZ1() {
		return Z1;
	}
	public void setY1(int Z1) {
		this.Z1 = Z1;
	}
}
* */