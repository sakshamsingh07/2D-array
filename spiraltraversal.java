import java.util.Scanner;
public class spiraltraversal
 {
     public static void spiral(int [][]arr)
     {
         int n = arr.length;
         int m = arr[0].length;
         int minr =0;
         int minc= 0;
         int maxr = n-1;
         int maxc= m-1;
         int count =0;
         int total= n*m;
         while(count<total)
         {
             for(int i =minr; i<=maxr && count<total;i++)
             {
                 System.out.println(arr[i][minc]+"\t");
                 count++;
             }
             minc++;
             for(int j=minc; j<=maxc && count<total;j++)
             {
                 System.out.println(arr[maxr][j]+"\t");
                 count++;
             }
             maxr--;
             for(int i =maxr; i>=minr && count<total;i--)
             {
                 System.out.println(arr[i][maxc]+"\t");
                 count++;
             }
             maxc--;
             for(int j=maxc; j>=minc && count<total;j--)
             {
                 System.out.println(arr[minr][j]+"\t");
                 count++;
             }
             minr++;
         }

     }
     public static void main (String []args)
     {
         Scanner scn = new Scanner (System.in);
         int n = scn.nextInt();
         int m = scn.nextInt();
         int [][]arr = new int [n][m];
         for (int i =0; i<arr.length;i++)
         {
             for(int j=0; j<arr[i].length;j++)
             {
                 arr[i][j]=scn.nextInt();
             }
         }
         spiral(arr);
     }
    
}
