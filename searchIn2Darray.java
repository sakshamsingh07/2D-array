import java.util.Scanner; 
public class searchIn2Darray
{
    public static void search(int [][]arr , int x)
    {
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(j>=0&&i<=n-1)
        {
            // for(int i =0 ; i<n;i++)
            // {
                // for (int j =0; j<n;j++)
                // {
                    if (arr[i][j]==x)
                    {
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                    else if (arr[i][j]<x)
                    {
                        i++;
                        
                    }
                    else if (arr[i][j]>x)
                    {
                        
                        j--;
                    }
               }
               System.out.println("not found");
            // }
           // if(i<0||j<0||i>=n||j>=n)
            //{
              //  break;
            //}
            // if(i<0)
            // {
            //     i++;
            // }
            // else if(j<0)
            // {
            //     j++;
            // }
            // else if(i>=n)
            // {
            //     i--;
            // }
            // else if (j>=n)
            // {
            //     j--;
            // }
            // System.out.println(i);
            // System.out.println(j);

           

       // }
        //return(-1);
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int x =scn.nextInt();
        int [][]arr= new int[n][n];
        for (int i =0;i<arr.length;i++)
        {
            for(int j =0; j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        search(arr,x);
        //System.out.println(ans);


    }
    
}
