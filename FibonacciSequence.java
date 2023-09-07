//6
//0 1 1 2 3 5 8 13 ...up to 100 term
class FSequence
{
	public static void main(String[]arg)
	{
		int a=0,b=1;
		System.out.println("Fibonacci Sequence :\n"+a+"\n"+b);
		for(int i=0;i<=10;i++)
		{
			int next=a+b;
			a=b;
			b=next;
			System.out.println(b);
		}
	}
}
