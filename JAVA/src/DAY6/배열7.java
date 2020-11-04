package DAY6;

public class 배열7 {

	public static void main(String[] args) {
		/*5개짜리 배열에 랜덤으로 값을 생성하여 저장한 후 출력하는 예제(5-9, p200)
		 * */
//		int arr[] = new int[] {10,11,12,13,14,15,16,17,18,19,20};
//		int min = arr[10];
//		int max = arr[20];
//		int random;
//		if(min <= arr[10]) {
//			max = arr[20];
//			System.out.println();
		//랜덤생성코드
		
				int min = 10;
				int max = 20;
				//1부터 10까지 저장하고 출력하는 코드
				int size = 5;
				int arr[] = new int[size];
				for(int i=0; i<arr.length; i++) {
					arr[i] = (int)((max - min + 1) * Math.random() + min);
					System.out.print(arr[i] + " ");
				}
				System.out.println();		
	}

}
