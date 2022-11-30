import java.util.Scanner;
public class exitPoint 
{
    public static void exit(int [][]arr)
    {
        int i =0,j=0,dir=0;
        int n=arr.length;
        int m =arr[0].length;
        while(true)
        {
            dir+=arr[i][j];
            dir%=4;
            if(dir==0)
            {
                j++;
            }
            else if (dir==1)
            {
                i++;
            }
            else if (dir==2)
            {
                j--;
            }
            else if (dir==3)
            {
                i--;
            }
            if(i<0||j<0||i>=n||j>=m)
            {
                break;    
            }
        }
        if(i<0)
        {
            i++;
        }
        else if(j<0)
        {
            j++;
        }
        else if(i>=n)
        {
            i--;
        }
        else if (j>=m)
        {
            j--;
        }
        System.out.println(i);
        System.out.println(j);  
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i =0 ; i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        exit(arr);
    }
    
}
