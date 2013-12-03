public class Log
{
	public static double logsum(int n)
	{
		if(n == 1)
			return 0;
		return Math.log(n) + logsum(n-1);
	}
	public static void main(String[] args)
	{
		int n = StdIn.readInt();
		System.out.println(logsum(n));
	}
}