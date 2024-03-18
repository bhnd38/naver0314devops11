package Day0318;

import java.util.Scanner;

public class Ex14_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5개의 점수(score)를 입력하면 갯수(count)와 합계(sum) 출력하기
		 * (단, 1~100 이 아닐 경우는 갯수에서 제외하고 합계에서도 제외하기-continue 사용)
		 * 
		 * (예)
		 * 
		 * 점수는? 80
		 * 점수는? 120
		 * 점수는? 70
		 * 점수는? 60
		 * 점수는? 100
		 * 
		 * 입력한 점수 갯수 : 4
		 * 총 합계 : 310
		 */
		
		int score, count=0, sum=0; //count나 sum에 값을 지정하지 않으면 밑에서 에러 발생.
		Scanner sc=new Scanner(System.in);
		

		for(int i=1;i<=5;i++) {
			System.out.println("입력할 점수는?");
			score=sc.nextInt();
			if(score<1 || score>100) {
				continue;
			}
			else {
				count+=1;
				sum+=score; //이 단계에서 에러가 난다. null+1과 같은 느낌.
			}
			
		}
		
		System.out.println(count);
		System.out.println(sum);
	}

}
