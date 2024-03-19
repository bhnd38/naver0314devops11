package Day0319;

public class Ex1_Munje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*강사님 풀이방법
		 * int count = 0;
		 * Loop:
		 * for(int i=1;i<=100;i++)
		 * {
		 * 		for(int j=2;j<i;j++)
		 * 		{
		 * 			if(i%j==0)
		 * 				continue Loop;  //i++로 이동
		 * 		}
		 * 		count++;
		 * 		System.out.printf("%3d",i);
		 * 		if(count%7==0)
		 * 			System.out.println();
		 * }
		 * System.out.println("\n소수의 갯수 :"+count);
		 */
		
		
		int count=0;
		
		for (int i=2;i<=100;i++)
		{	int factors = 0;
			for (int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					factors++;
				}
			}
			if (factors==2)
			{
				count++;
				System.out.printf("%3d",i);
				if(count%5==0)
					System.out.println();
			}
		}
		System.out.println("\n소수의 개수: "+count);
	}

}
