public class Euclid
{
	public static int gcd(int a,int b,int i)
	{
		StdOut.printf("the %d time:",i);
		StdOut.println("a=" + a + ", b=" + b);
		if(b == 0)
			return a;
		else
			return gcd(b,a % b,i + 1);
	}
	public static void main(String[] args)
	{
		int N1 = Integer.parseInt(args[0]);
        int N2 = Integer.parseInt(args[1]);
        if(N1 < N2)
        {
        	int t = N1;
        	N1 = N2;
        	N2 = t;
        }
		StdOut.println(gcd(N1,N2,1));
	}
}