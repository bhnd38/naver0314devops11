package Day0319;

import java.util.StringTokenizer;

public class Ex8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** String 객체의 Method 공부하기 **");
		String str1="Have a Nice Day";
		String str2="apple";
		String str3="Apple";
		
		System.out.println(str1.charAt(7));//7번 인덱스의 문자 : N
		System.out.println(str1.charAt(0));//0번 인덱스의 문자 : H
		System.out.println(str1.indexOf('a'));//첫 번째 'a'의 위치 : 1
		System.out.println(str1.indexOf('x'));//첫 번째 'x'의 위치 : -1(없을 경우 -1)
		System.out.println(str1.lastIndexOf('a'));//마지막 'a'의 위치 : 13
		System.out.println(str1.length());//str1의 총 길이: 15
		System.out.println(str2.concat("***"));//str2 문자에 ***추가해서 반환
		System.out.println(str2+"***");//위와 같다
		System.out.println(str1.toLowerCase());//모두 소문자로 변환해서 반환
		System.out.println(str1.toUpperCase());//모두 대문자로 변환해서 반환
		
		//문자열 비교시(값으로 비교시 equals 사용)
		System.out.println("apple".equals(str2));//true
		System.out.println("apple".equals(str3));//false
		System.out.println(str2.equals(str3));//false : 대소문자가 다르므로 false
		System.out.println(str2.equalsIgnoreCase(str3));//대소문자 상관없이 비교 : true
		System.out.println(str2==str3); //객체시 주소를 비교: 주소가 다르므로 false(==동등연산자는 기본값 비교시에만 사용)
		
		//문자열 추출
		System.out.println(str1.substring(7));//7번 인덱스부터 끝까지 추출 : Nice Day
		System.out.println(str1.substring(7,10));//7부터 9까지 추출 : Nice Day
		
		//문자열 비교
		System.out.println(str1.startsWith("Have"));//str1이 Have로 시작하면 true : true
		System.out.println(str1.startsWith("Nice"));//str1이 Nice로 시작하면 true : false
		
		System.out.println(str1.endsWith("Day"));//str1이 Day로 끝날 경우 true : true
		System.out.println(str1.endsWith("day"));//str1이 Day로 끝날 경우 true : false(대소문자 구분함)
		System.out.println(str1.toLowerCase().endsWith("day"));//str1을 소문자로 변환 후 day로 끝나는 지 비교 : true
		
		//compareTo 로 비교시
		System.out.println("apple".compareTo("append"));//'l','e' : l이 e보다 l이 e보다 7만큼 크므로 7(양수: 첫 문자열이 더 크다), 첫문자열이 작을 경우 음수가 나온다
		System.out.println("apple".compareTo("banana"));//'a','b' : a가 b보다 1만큼 작으므로 -1
		System.out.println("apple".compareTo("apple"));//끝까지 완전히 같을 경우 0
		
		//반복
		System.out.println(str2.repeat(3));
		System.out.println("*".repeat(10));
		
		//일부 변경
		System.out.println(str1.replace('a','*'));//H*ve * Nice D*y
		System.out.println(str1.replace("Nice","Good"));//Have a Good Day
		
		//문자열 분리(결과값이 배열 타입)
		String colors="red,blue,green,yellow,pink";
		System.out.println(colors);
		//, 로 분리를 하고싶을 경우
		String []a1=colors.split(",");
		System.out.println("분리된 배열의 갯수:"+a1.length);
		System.out.println(a1[0]+","+a1[4]);//0번값과 4번 배열값 출력
		
		//분리하는 또 다른 방법
		StringTokenizer st=new StringTokenizer(colors,",");
		System.out.println("분리할 토큰수 :"+st.countTokens());
		//분리된 토큰값 출력
		while(st.hasMoreTokens())//더 이상 토큰이 없을 경우 false가 되면서 while문을 빠져나간다
		{
			System.out.println(st.nextToken());//다음 토큰 꺼내서 출력
		}
		
		String msg="   hello   ";
		System.out.println(msg.length());//11글자
		System.out.println(msg.trim().length());//양쪽 공백 제거 후 5글자
		
		//valueOf: 어떤 타입의 데이터든지 모두 String으로 변환해준다
		System.out.println(String.valueOf(3));//정수 3이 문자열"3"으로 반환
		System.out.println(3+"");//이 방법도 있음. java는 모든 값에 string을 더하면 string 타입이 됨.
		
	}

}
