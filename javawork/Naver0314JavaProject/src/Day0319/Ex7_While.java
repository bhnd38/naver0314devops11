package Day0319;

import java.util.Scanner;

public class Ex7_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while문을 이용하여 score 점수를 입력받은 후
		 * 0을 입력하면 while문을 빠져나가서 총 갯수와 합계를 구하시오
		 * (단, 1~100이 아닌 값은 갯수와 합계에서 제외)
		 */
		
		Scanner sc=new Scanner(System.in);
		int score, count=0, sum=0;
		
		while(true)
		{	
			System.out.println("점수를 입력하세요");
			score=sc.nextInt();
			
			if(score==0)
				break;
			
			//잘못 입력한 경우 갯수에서 제외
			if(score<0 || score>100)
				continue; //조건식으로 이동
			
			count+=1;
			sum+=score;

		}
		System.out.println("갯수: "+count);
		System.out.println("합계: "+sum);
		
		sc.close();
	}

}
