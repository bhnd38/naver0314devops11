package Day0315;

import java.util.Scanner;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름(name),핸드폰(hp),태어난 년도(birthYear) 입력받은 후
		 * 이름, 핸드폰, 태어난 년도, 나이(age, 2024-태어난 년도)를 출력하는 프로그램을 작성하시오
		 * 선언-입력-계산-출력
		 */
		
		Scanner sc= new Scanner(System.in);
		int age, birthYear;
		String name,hp;
		
		System.out.println("이름은?");
		name=sc.nextLine();
		System.out.println("핸드폰 번호는?");
		hp=sc.nextLine();
		System.out.println("태어난 년도는?");
		birthYear=Integer.parseInt(sc.nextLine());
		
		age=2024-birthYear +1;
		
		System.out.println("이름: "+name);
		System.out.printf("핸드폰: %s \n",hp);
		System.out.printf("나이: %d년생 %d세입니다",birthYear,age);
	}

}
