package DAY02;

import java.util.Scanner;

public class If문3 {

	public static void main(String[] args) {

		/* 조건식1이 참이면 실행문1을 실행하고
		 * 조건식1이 거짓이고 조건식2가 참이면 실행문2를 싱행하고
		 * 조건식1과 조건식2가 거짓이면 실행문 3을 실행해라
		 * if(조건식1){
		 *      실행문1;
		 * }else if(조건식2){
		 *      실행문2;
		 * }else{
		 *      실행문3;
		 *      }
		 * */
		/* 정수를 입력받아 입력받은 정수가 양수이면 양수라고 출력하고 0이면0이라고 출력하고
		 * 음수이면 음수라고 출력하세요.
		 * */
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.println("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num > 0) {
			System.out.println(num + "는 양수");


	    }else{
            System.out.println(num);
	    }
	    
	    
	    /*성적(점수)을 입력받아 입력받은 성적에 맞는 학점을 출력하세요.
	     * A : 90 ~ 100
	     * B : 80 ~ 89 
	     * C : 70 ~ 79 
	     * D : 60 ~ 90 
	     * E : 0 ~ 59   
	     * 잘못된 성적 : 0미만, 100초과
	     */
		
		int score;
		System.out.println("성적을 입력하세요(0~100): ");
		score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			 System.out.println("A");
		}else if(score >= 80 && score < 90) {
		     System.out.println("B");
		}else if(score >= 70 && score < 80) {
		     System.out.println("C");
		}else if(score >= 60 && score < 70) {
		     System.out.println("D");
     	}else if(score >= 0 && score < 60) {
	          System.out.println("F");
	    }else {
	    	System.out.println("잘못된 성적");
	    }
		if(score > 100 || score < 0) {
			System.out.println("잘못된 성적");
		}else if(score>= 90) {
			System.out.println("A");
		}else if(score>= 80) {
			System.out.println("B");
		}else if(score>= 70) {
			System.out.println("C");
		}else if(score>= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	    scan.close();

		
	    
		
	}

}
