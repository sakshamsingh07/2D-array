import java.util.Scanner; 
public class stateOfWakanda2  
{
    public static void sow2(int [][]arr)
    {
        for(int gap=0;gap<arr.length;gap++)
        {
            for(int i =0,j=gap;j<arr.length;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][]arr= new int[n][n];
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        sow2(arr);
    }
    
}
