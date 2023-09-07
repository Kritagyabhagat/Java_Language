class Prime_number
{
	public static void main(String[]arg)
	{
		int a,c;
		for(int i=1;i<=50;i++)
		{
			c=0;
			for(a=1;a<=i;a++)
			{
				if(i%a==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("prime="+i);
			}
			else
			{
				System.out.println("Not prime"+i);
			}		
		}
	}
}
