class Swap
{
	public static void main(String[]arg)
	{
		double a,b,c;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		if(a>=b)
		{
			System.out.println("Value of a = "+a);
			System.out.println("Value of b = "+b);
		}
		else
		{
			c=a;
			a=b;
			b=c;
			System.out.println("Value of a = "+a);
			System.out.println("Value of b = "+b);

		}
	}
}
