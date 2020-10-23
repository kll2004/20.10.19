package DAY5;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		/*배열 복사
		 * 일반 변수 복사
		 * */
		//int num1 = 10, num2;
		//num2 = num1;
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = arr1;
		//arr2[0] = 100;
		//System.out.println("arr1[0] : "+arr1[0]);
		//System.out.println("arr2[0] : "+arr2[0]);
		arr2 = new int[arr1.length];
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];			
		}
		arr2[0]=100;
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr2[0] : "+arr2[0]);
		int arr3[]=new int[arr1.length*2];		
		System.arraycopy(arr1, 1, arr3, 1, arr1.length-1);
		
		
		
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			
		//arr3출력하는 코드
		}
		System.out.println();
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(i+1+"번쨰 정수를 입력 : ");
			arr1[i] = scan.nextInt();
		}
		scan.close();
		
		
		//arr1 츨력하는 코드
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
