import java.util.Arrays;

public class BinarySearch
{
	public static int rank(int key,int[] a)
	{
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi)
		{
			int mid = (lo + hi) / 2;
			if(a[mid] > key)
				hi = mid - 1;
			else if(a[mid] < key)
				lo = mid + 1;
			else 
				return mid;
		}
		return -1;
	}

	public static int lg(int N)
	{
		int sum = 1;
		int j = 1;
		int i;
		while(true)
		{
			sum = 1;
			for (i = 1; i <= j;i++ ) 
			{	
				sum *= 2;

			}
			if(sum >N)
			{
				return j - 1;
			}
			if(sum == N)
			{
				return j;
			}
			j++;
		}
	}

	 private static int lg1(int N)
    {
        int product = 1;
        int x = -1;
        if (N < 1) throw new RuntimeException("Error, N should be larger than 0");
        else 
        while (product <= N) 
        {
            product *= 2;
            x++;
        }

        return x;
    }


    private static int lg2(int N)
    {
    	int product = 1;
    	int x = -1;
    	while(product <= N)
    	{
    		product *= 2;
    		x++;
    	}

    	return x;
    }

	public static String tobinary(int n)
	{
		String s = "";
		for (int i = n; i > 0; i /=2 ) {
			s = (i%2) + s;
			System.out.println(s);
		}
		return s;
	}
	public static void main(String[] args)
	{
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		for(int x : whitelist)
			StdOut.print(x + " ");
		System.out.println('\n');
		/*boolean x = true && false || true && true;
		StdOut.println(x);
		int key = StdIn.readInt();
		if(rank(key,whitelist) >= 0)
			StdOut.println("have this key");
		else
			StdOut.println("no such key");*/
		/*while(!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if(rank(key,whitelist) < 0)
				StdOut.println(key);
		}

		System.out.println(1 + "txts"  );
		System.out.println('b' + 'c');
		System.out.println((char)('a' + 4));
		System.out.println(tobinary(4));*/
		for (int x = 1; x <= 17; x++) {
			System.out.println(x + ":" + lg(x));
		}
		System.out.println("lg1:\n");
		for (int x = 1; x <= 33;x++ ) {
			System.out.println(x + ":" + lg1(x));
		}
		//System.out.println(lg(16));

	}
}