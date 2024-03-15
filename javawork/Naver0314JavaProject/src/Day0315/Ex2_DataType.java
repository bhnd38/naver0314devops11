package Day0315;

public class Ex2_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 타입
		byte a=127;
		System.out.println(a);
		
		byte b=(byte)200;//(byte): cast 연산자. : 강제로 형변환, 값손실 발생
		System.out.println(b);//값손실이 발생할 경우 엉뚱한 값이 출력(내부적으로는 2의 보수값이다)
		
		//실수 타입
		float f1 = 123.567891234f; //끝에 f를 붙여야 4byte float으로 저장됨.
		double f2 = 123.4567891234;
		
		System.out.println(f1);//정밀도가 보통 8자리까지 정확히 나옴
		System.out.println(f2);//정밀도가 보통 15자리까지 정확히 나옴.
		
		//1글자 지정은 char, 문자열은 String(객체타입)
		char ch1='A';
		char ch2='가';//2byte라 한글 한글자도 가능
		System.out.println(ch1);
		System.out.println(ch2);
		
		//문자열 지정하는 방법
		String str1= new String("happy"); //방법1
		String str2="hello";//방법2
		System.out.println(str1);
		System.out.println(str2);
		
		//긴 문자열을 지정하는 경우
		String str3="나는 오늘도 자바를 공부한다.. 오늘은 즐거운 금요일인데 할일이 없다.. 어쩌고 저쩌고...";
		String str4="나는 오늘도 자바를 공부한다..\n"
				+"오늘은 즐거운 금요일인데 할일이 없다..\n"
				+"어쩌고 저쩌고....";
		System.out.println(str3);
		System.out.println();//한줄띄움
		System.out.println(str4);
		//JDK 15부터 가능한 기능. 텍스트 블록 기능.
		String str5="""
				나는 오늘도 자바를 공부한다..
				오늘은 즐거운 금요일인데 할일이 없다..
				어쩌고 저쩌고...
				""";
		System.out.println();
		System.out.println(str5);
		
	}

}
