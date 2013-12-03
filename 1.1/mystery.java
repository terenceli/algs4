public class mystery
{
	public static int myst(int a,int b)
	{
		if(b == 0) return 0;
		if(b % 2 == 0)  return myst(a + a,b / 2);
		return myst(a + a,b / 2) + a;
	}
	public static void main(String[] args)
	{
		System.out.println(myst(2,25));
		System.out.println(myst(3,11));
	}
}