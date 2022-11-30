import java.util.Scanner;
public class matrixrotate 
{
    public static void transpose(int [][]arr)
    {
        int n=arr.length;
        for(int i =0; i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int c = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=c;
            }
        }
    }
    public static void reverse1d(int []arr)
    {
        int n=arr.length;
        int li =0;
        int ri=n-1;
        while(li<=ri)
        {
            int c =arr[li];
            arr[li]=arr[ri];
            arr[ri]=c;
            li++;
            ri--;
        }
    }
    public static void reverse2d(int [][]arr)
    {
        int n =arr.length;
        for(int []d:arr)
        {
            reverse1d(d);
        }
    }
      public static void display(int [][]arr)
      {
          int n =arr.length;
          for(int i =0 ;i<n;i++)
          {
              for(int j=0; j<n;j++)
              {
                  System.out.print(arr[i][j]+" ");
              }
              System.out.println();
          }
      }
      public static void main(String []args)
      {
          Scanner scn =new Scanner (System.in);
          int n = scn.nextInt();
          int [][]arr=new int[n][n];
          for(int i=0;i<arr.length;i++)
          {
            for(int j =0 ; j<arr[i].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
          }
          transpose(arr);
          reverse2d(arr);
          display(arr);
      }
    
}
