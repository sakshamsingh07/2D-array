import java.util.Scanner;
public class rotate2DarrayBy90degree
{
    public static void transpose(int [][]arr)
    {
        int n= arr.length;
        // int m =arr[0].length;
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
    public static void reverse(int [][]arr)
    {   int n =arr.length;
        for(int i =0;i<n;i++)
        {
        int li=0;
        int ri=n-1;
        while(li<=ri)
        {
            int c = arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=c;
            // swap(arr,li,ri);
            li++;
            ri--;
        }
        }
    }
    // public static void swap(int [][]arr,int ri,int li)
    // { for (int i=0;i<arr.length;i++)
    //     {
       
    //     }
    // }
    public static void display(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String []args)
    {
        Scanner scn= new Scanner (System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        transpose(arr);
        reverse(arr);
        display(arr);

    }

    
}
