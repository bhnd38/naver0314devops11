package Day0319;

public class Ex3_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		int num;
		for(x=1;x<=9;x++)
		{
			for(y=1;y<=9;y++)
			{
				num=(10*x + y) + (10*y + x);
				if(num==121)
				{
					System.out.printf("x=%d y=%d\n",x,y);
					
				}
			}
		}
			
	}

}
