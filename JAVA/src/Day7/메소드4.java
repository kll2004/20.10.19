package Day7;

public class 메소드4 {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,4,6,7,8,9,10,18};
		printArray(arr);
		int arr1[] = new int[] {1,9,8,5,2,6};
		sortArray(arr1);
		sortArray2(arr);
		printArray(arr);
		arr = createArray(5);
		printArray(arr);
		
	}
	/*기능 : 주어진 정수 배열의 값들을 콘솔에 촐력하는 메소드
	 * 매개변수 : 정수 배열=> int arr[]
	 * 리턴타입 : 없음 =>void
	 * 메소드명 :printArray
	 * ※길이 = arr.length
	 * */
	static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			//5번씩 한줄에 출력하기위한 코드
			if(i % 10 ==0) {
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	
	/* 기능 : 주어진 정수 배열을 정렬하는 메소드
	 * 매개변수 : 정수 배열=> int arr[] 1,3,4,8,6,3,5,4,1나열된 숫자를 정렬
	 * 리턴타입1 : 없음 =>void
	 * 리턴타입2 : 정렬된 배열 : int[]
	 * 매소드명 : sortArray
	 * */
	static void sortArray(int [] arr) {
		int arr1[] = new int[] {1,9,8,5,2,6};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j] > arr1[j+1]) {
					int tmp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = tmp;
				}
			}
			for(int j =0;j<arr1.length;j++) {
				System.out.print(arr1[j] + " ");
			}
			System.out.println();
		}

	}		

	//매개변수가 일반 변수이면 매개변수의 값이 바뀌지 않는다.
	//=>텍스트 파일을 복사하여 실행한 후 작없을 하면 원본이 안바뀐다.
	//매개변수가 참조변수이면 매개변수의 값이 바뀔수 있다.
	//=>바로가기를 이용하여 프로그램을 실행후 내용을 변경하면 원본이 바귈수있다.
	static int[] sortArray2(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
		
	/*기능 : 새로운 정수 배열을 만들어서 돌려주는 메소드
	 * 매개변수 : 만들어야할 배열 => int [] arr
	 * 리턴타입 : 새로 만든 정수 배열 => int[]
	 * 메소드명 : createArray 
	 * */
	static int[] createArray(int size) {
		return new int [size];
	}	
}