package ex4no5;

import java.util.Scanner;

public class ex4no5 {  // 145p
	public static void main(String[] args) {
		int score = 0 ;
		char grade = ' ' ,opt = '0';
		
		System.out.println("점수를 입력 해주세요.>");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 % d입니다. % n",score);
		
		if(score >= 90) {
			grade = 'A' ;
			if(score >= 98) {
				opt = '+' ;
			}else if(score < 94) {
				opt = '-' ;
			}
		}else if(score >= 80) {
			grade = 'B' ;
			if(score >= 88) {
				opt = '+' ;
			}else if(score < 04) {
				opt = '-' ;
			}
		}else {
			grade = 'C' ;
		}
		System.out.printf("당신의 학점은 % c % c입니다. % n", grade, opt);
	}

}
