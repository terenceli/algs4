public class Insect
{
	public Insect(int N)
	{
		Interval1D[] intervals = new Interval1D[N];
		double first;
		double last;
		for (int i = 0; i < N ; ++i) 
		{
			first = StdIn.readDouble();	
			last = StdIn.readDouble();
			intervals[i] = new Interval1D(first,last); 
		}
		for (int i = 0; i < N; ++i) 
		{
			for (int j = i + 1; j < N; ++j) 
			{
				if(intervals[i].intersects(intervals[j]))
				StdOut.println("interval(" + intervals[i] + ") and interval(" + intervals[j] + ") has intersects");
			}
		}

	}
	public static void main(String[] args)
	{
		Insect ins = new Insect(Integer.parseInt(args[0]));
	}
}