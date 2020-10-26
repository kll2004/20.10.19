package DAY6;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		/* 3명의 국어 점수를 입력받아 배열에 저장하고,
		 * 3명의 국어 점수의 총점과 평균을 구하는 예제*/
		int size = 3;
		int kor[] = new int[size];
		
		Scanner scan = new Scanner(System.in);
		int sum;
		double avg;
		
		System.out.println(1+"번 학생의 국어 성적 : ");
		kor[0] = scan.nextInt();
		System.out.println(2+"번 학생의 국어 성적 : ");
		kor[1] = scan.nextInt();
		System.out.println(3+"번 학생의 국어 성적 : ");
		kor[2] = scan.nextInt();
		
		sum = kor[0] + kor[1] + kor[2];
		avg = (double)sum / kor.length;
		
		System.out.println("3명 학생의 총점 : "+sum);
		System.out.println("3명 학생의 총점 : "+avg);
		//2번째
		sum = 0;
		for(int i =0; i<kor.length; i++) {
			System.out.println(i+1+"번 학생의 국어 성적 : ");
			kor[i] = scan.nextInt();
			sum = sum + kor[i];
		}
		avg = (double)sum / kor.length;
		System.out.println("3명 학생의 총점 : "+sum);
		System.out.println("3명 학생의 총점 : "+avg);		
		scan.close();

	}

}
