public class StudentGrade {
    
     public static void main(String[] args)
     {
        
         String[] s = StdIn.readStrings();
         
         
         int N = s.length / 3;
         for (int i = 0; i < N; i++)
         {
             String name = s[3*i];
             int mathGrade = Integer.parseInt(s[3*i+1]);
             int averageGrade = Integer.parseInt(s[3*i+2]);
             double percentage = (double)mathGrade / (double)averageGrade; 
             StdOut.printf("%s" + "   \t" + "%d" + "   \t" + "%d" + "   \t" + "%.3f\n", name, mathGrade, averageGrade, percentage); 
         }
     }
}