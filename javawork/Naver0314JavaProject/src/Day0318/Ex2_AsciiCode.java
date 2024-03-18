package Day0318;

public class Ex2_AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		char b=65; //아스키 코드로 65는 문자 'A'이다
		System.out.println(a+","+b);
		System.out.printf("a=%d,%c\n",(int)a,a);
		System.out.printf("b=%d,%c\n",(int)b,b);
		System.out.println(a+3); //68, char+int=int
		
		char c='7';
		System.out.println(c); //문자 7이 출력. 숫자 7이 아님.
		System.out.println(c+2); //'7'+2 => 55+2 => 57
		//숫자 7로 변경 후 계산하고자 할 경우
		int n1=c-'0'; //55-48=7, //'7'은 55, '0'은 48
		System.out.println(n1); //숫자 7이 출력
		System.out.println(n1+2); //7+2=9
	}

}
