public class Min
{
	public Min()
	{
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0,1);
		StdDraw.setPenRadius(.005);
	}

	public void getTheMinDistance(int N)
	{
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N ; ++i) 
		{
			double x = StdRandom.random();
			double y = StdRandom.random();
			points[i] = new Point2D(x,y);
			StdDraw.point(x,y);
		}

		Point2D x = new Point2D(0,0);
		Point2D y = new Point2D(0,0);
		double minDist = 2;

		for (int i = 0; i < N; ++i) 
		{	
			for (int j = i + 1; j < N ; ++j) 
			{
				if(minDist > points[i].distanceTo(points[j]))
				{
					minDist = points[i].distanceTo(points[j]);
					StdOut.println(minDist);
					x = points[i];
					y = points[j];
				}
			}
		}

		x.drawTo(y);
		
	}
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		Min min = new Min();
		min.getTheMinDistance(N);
	}
}