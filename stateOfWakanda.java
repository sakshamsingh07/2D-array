import java.util.Scanner; 
public class stateOfWakanda 
{
    public static void wakanda(int [][]arr)
    {
      for(int j=0;j<arr.length;j++)
      {
          if(j%2==0)
          {
              for(int i=0;i<arr.length;i++)
              {
                  System.out.println(arr[i][j]+"\t ");
              }
          }
          else
          {
              for(int i =arr.length-1;i>=0;i--)
              {
                  System.out.println(arr[i][j]+"\t ");
              }
          }
      }  
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int m = scn.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        wakanda(arr);

    }  
}
