//formula c=(F-32)/1.8
class Fahrenheit_to_Celsius
{
	public static void main(String[]arg)
	{
		double C,F;
		C=Double.parseDouble(arg[0]);
		F=(C*1.8)+32;
		System.out.println("Fahrenheit = "+F);
	}
}
