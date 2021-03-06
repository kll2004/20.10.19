package DAY07;

public class 로또예제_메소드 {

	public static void main(String[] args) {
		int [] lotto = new int[7]; //당첨번호, 6자리가 보너스번호
		int [] user = new int[6];
		int min = 1, max = 45;
		randomArray(lotto, min, max);
		printArray(lotto);
		randomArray(user, min, max);
		printArray(user);
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝입니다. 다음기회에");
		}else {
			System.out.println(rank+"등입니다.");
		}switch(rank) {
		case 1 : case 2 : case 3 : case 4 : case 5 :
			System.out.println(rank+"등입니다.");
			break;
			default : 
				System.out.println("꽝입니다. 다음기회에");
		}
	}
	/*기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매개변수 : 1부터10까지의 랜덤값을 출력, 원하는 정수 범위 =>min부터max까지=>int min, int max
	 * 리턴타입 : 랜덤한 값=> 정수 => int
	 * 메소드명 : random
	 * 
	 * */
	static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int) ((max - min + 1) * Math.random() + min);
		// 0<
	}
	/* 기능 : 주어진 배열에 모든 번지에 있는 값을 랜덤으로 설정하는 메소드
	 * 매개변수 : 기능을 실행하기 위해 필요한 정보(필수 정보) - 번지에있는 값 / 주어진배역, 랜덤 범위 =>int []arr, int min, int max
	 * 리턴타입 : 기능을 실행후 알려주는 정보(자료형으로 표시) - 랜덤값 ,정수, / 없음 =>void
	 * 메소드명 : randomArray - 랜덤배열
	 * */

	//0 0 0 0 0 0
	//1 2 3 4 5 6 
	//1 1 1 1 1 3 3 3 4 5 5 6 7
	static void randomArray(int []arr, int min, int max) {
		if(max-min+1 <= arr.length){
		}
		int cnt = 0;//현재까지 만들어지 중복되지 않은 랜덤수의 개수
			while(cnt < arr.length) {
				int r = random(min, max);
				if(!iscontain(arr,r)) {
					arr[cnt] = r;
					cnt++;
				}
			}
	}
	static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			//5번씩 한줄에 출력하기위한 코드
			if(i % 10 ==0) {
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/* 기능 : 배열에 특정 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열[],특정값 int => int []arr, int num
	 * 리턴타입 : 있는지 없는지 =>참 또는 거짓 =>boolren
	 * 메소드명 : isContain
	 * */
	static boolean iscontain(int []arr, int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	/*기능 : 로또번호의 등수를 알려주는 메소드
	 *  => 사용자가 자동으로 생성한 번호가 몇등ㅇ니지 알려주는 메소드
	 *     (단, 등수에 없으면 -1을 알려줌)
	 *     매개변수 : 로또번호, 사용자 번호=>int []lotto, int []user
	 *     리턴타입 : 등수 =>int
	 *     메소드명 : lottorank
	 *     */
	static int lottoRank(int []lotto, int []user) {
		if(lotto.length<=user.length)
			return -1;
		int cnt = 0;//로또번호 일치하는 사용자 번호갯수(단, 보너스번호는 제외)
		//보너스번호를 갯수에 포함시키지 않기 위해 user.length개수만큼만 비교
		for(int i=0;i<user.length; i++) {
			if(iscontain(user, lotto[i])) {
				cnt++;
			}				
		}
		switch(cnt){
		case 6 : return 1;
		case 5 : 
			return iscontain(user, lotto[lotto.length-1])?2:3;
		case 4 : return 4;
		case 3 : return 5;
		default : return -1;		
		}
	}

}
