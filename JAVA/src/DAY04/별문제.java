package DAY04;

public class 별문제 {

	public static void main(String[] args) {
		/*이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		int i,j;
		for(i = 1; i<=5; i++) {
		  for(j = 1; j<=5 ; j++) {
			System.out.print("*");
		}
		 System.out.println();
		}
		
		
		//이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요
		
		/* *        i = 1 * = 1
		 * **       i = 2 * = 2
		 * ***      i = 3 * = 3
		 * ****     i = 4 * = 4
		 * *****    i = 5 * = 5
		 * */
		
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.println(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
			
		
		
		
		
		for(i = 1; i<=1; i++) {
		for(j = 1; j<=1; j++) {
			System.out.print("*");
		}
		    System.out.println();
		}
		for(i = 1; i<=1; i++) {
	    for(j = 1; j<=2; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		for(i = 1; i<=1; i++) {
		for(j = 1; j<=3; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		for(i = 1; i<=1; i++) {
		for(j = 1; j<=4; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		for(i = 1; i<=1; i++) {
		for(j = 1; j<=5; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
		
		for(i = 1; i<=5; i++) {
		for(j = 1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
			}
		
		
		
	
		//이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요
		
		/*     *    i = 1 * = 1 공 = 4
		 *    **    i = 2 * = 2 공 = 3
		 *   ***    i = 3 * = 3 공 = 2
		 *  ****    i = 4 * = 4 공 = 1
		 * *****    i = 5 * = 5 공 = 0
		 *                
		 * */


	}

}
