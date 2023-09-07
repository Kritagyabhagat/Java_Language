class Perfect_no
{
	public static void main (String[]arg)
	{
		int a,b,c=0;
		b=Integer.parseInt(arg[0]);  //21=3,721
		for(a=1;a<b;a++)
		{
			if(b%a==0)
			{
				c=c+a;
			}
		}
		System.out.println(c);
		if(c==b)
		{
			System.out.println("Perfect Number");

		}
		else
		{
			System.out.println("Not perfect Number");

		}
	}
}
