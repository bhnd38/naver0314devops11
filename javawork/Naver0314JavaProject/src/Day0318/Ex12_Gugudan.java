package Day0318;

import java.util.Scanner;

public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단? 11
		 * 잘못된 숫자입니다 : if문
		 * 
		 * 구구단?5
		 * 		** 5단 **
		 * 
		 * 		5 x 1 = 5  : 단일for문
		 * 		5 x 2 = 10
		 * 		.
		 * 		.
		 * 		.
		 * 		5 x 9 = 45
		 * 
		 * 
		 */
		
		System.out.println("구구단 계산하기");
		Scanner sc=new Scanner(System.in);
		int x,y,answer;
		System.out.println("계산할 단 수?");
		x=sc.nextInt();
		if(x<2 || x>9) {
			System.out.println("잘못된 숫자입니다");
			return;//메인함수 종료
		} 
		
		System.out.println("** "+x+"단 **\n");
		for(y=1;y<=9;y++)
		{
			answer = x*y;
			System.out.printf("%d X %d = %d\n",x,y,answer);
		}
			
		
		
	}

}
