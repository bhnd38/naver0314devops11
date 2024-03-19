package Day0319;

import java.util.Scanner;

public class Ex11_StringMunje {
	public static void main(String[] args) {
		/*
		 * 문제
		 * String 타입의 문자열(msg)를 입력받아
		 * 그 문자열 안에 대문자, 소문자, 숫자가 몇 개 포함되어 있는지 출력하시오
		 * 예)
		 * Happy Day 123!!
		 * 대문자 : 2개
		 * 소문자 : 6개
		 * 숫 자 : 3개
		 * 
		 *  string 의 charAt 을 length 를 사용하면 됨
		 */
		
		//강사님 풀이
//		Scanner sc=new Scanner(System.in);
//		String msg;
//		int upperAlpha=0, lowerAlpha=0, num=0;
//		System.out.println("문장을 입력하세요");
//		msg=sc.nextLine();
//		
//		for(int i=0;i<msg.length();i++)
//		{
//			//i번지 인덱스의 문자 얻기. 문자가 속한 범위를 통해 특정해내기.
//			char ch=msg.charAt(i);
//			
//			if(ch>='a' && ch<='z')
//				lowerAlpha++;
//			else if(ch>='A'&& ch<='Z')
//				upperAlpha++;
//			else if(ch>='0' && ch<='9')
//				num++;
//		}
//		System.out.println("소문자 : "+lowerAlpha);
//		System.out.println("대문자 : "+upperAlpha);
//		System.out.println("숫 자 : "+num);
		
		int upperCount=0, lowerCount=0, numCount=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{	
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z')
				lowerCount+=1;
			
			else if (ch>='A' && ch<='Z')
				upperCount+=1;
			
			else if (ch>='0' && ch<='9')
				numCount++;
			
		}
		System.out.println("대문자: "+upperCount);
		System.out.println("소문자: "+lowerCount);
		System.out.println("숫 자: "+numCount);
		
	}
}
