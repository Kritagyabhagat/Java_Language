class Obtain_marks_by_student
{
	public static void main(String[]arg)
	{
		int a;
		a=Integer.parseInt(arg[0]);
		if(a>81)
		{
			System.out.println("in the range 81 to 100");
		}
		else if(a>61)
		{
			System.out.println("in the range 61 to 80");
		}
		else if(a>41)
		{
			System.out.println("in the range 41 to 60");
		}
		else
		{
			System.out.println("in the range 0 to 40");
		}
	}
}
