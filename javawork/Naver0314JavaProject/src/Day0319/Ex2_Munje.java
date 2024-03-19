package Day0319;

public class Ex2_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{	
			sum*=i;
			if (i==1)
			{
				sum=i;
				System.out.println(i+"!="+sum);
			}
			else
			{
				System.out.println(i+"!="+sum);
			}
				
		}
	}

}
