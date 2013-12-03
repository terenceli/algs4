import java.util.Arrays;

public class histogram
{
	public static int[] histo(int[] a,int M)
	{
		int[] b = new int[M];
		for(int i = 0;i < a.length; ++i)
		{
			if(a[i] < M)
				b[a[i]]++;
		}
		return b;
	}
	public static void  main(String[] args)
	{
		int[] a = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,7,8,9};
		int[] ret = histo(a,5);
		for(int x: ret)
		{
			System.out.println(x + " ");
		}
	}
}

