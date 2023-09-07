class Method
{
	public Method()	
	{
		int a=1;
		int b=4;
		int c=a+b;
		System.out.println("call Constructor:-"+c);
	}
	public static void main(String arg[])
	{
		// Method d =new Method();
		// int a=70;
		// int b=90;
		// d.add(a,b);
		// sub();
		// d.mul();
		// d.divide();
	}
	public void add(int x, int y)	
	{
		int a=x;
		int b=y;

		int c=a+b;
		System.out.println("Addition:-"+c);
	}
	
	public static void sub()
	{
		int a=40;
		int b=20;
		int c=a-b;
		System.out.println("Subtraction:-"+c);
	}
	public void mul()	
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication:-"+c);
	}
	public void divide()	
	{
		int a=100;
		int b=20;
		int c=a/b;
		System.out.println("Division:-"+c);
	}
}
