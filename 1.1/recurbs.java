import java.util.Arrays;
public class recurbs
{
	public static int rank(int key,int[] a)
	{
		return rank(key,a,0,a.length - 1,1);
	}
	public static int rank(int key,int[] a,int lo,int hi,int deep)
	{
		for (int i = 0;i < deep ; i++) 
		{
			StdOut.print("*");
		}
		StdOut.println("lo:" + lo + "hi:" + hi);
		if(lo > hi)
			return -1;
		int mid = (lo + hi) / 2;
		if(key < a[mid]) return rank(key,a,lo,mid - 1,deep + 1);
		else if(key > a[mid]) return rank(key,a,mid + 1,hi,deep + 1);
		else 	return mid;
	}

	public static void main(String[] args)
	{
		int[] array = In.readInts(args[0]);
		Arrays.sort(array);
		int key =  StdIn.readInt();
		if(rank(key,array) != -1)
			StdOut.println("find it!");
	}
}