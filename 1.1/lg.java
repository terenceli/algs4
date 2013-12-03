 public class lg
 {
    public static int lg1(int N)
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

    public static void main(String[] args)
    {
        for (int i = 1; i <= 33; ++i) 
        {
            System.out.println(i + ":" + lg1(i));   
        }
    }

 }
 