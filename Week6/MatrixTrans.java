import java.util.Scanner;
public class MatrixTrans
{
    public static void main(String args[])
    {
        int i,j,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of matrix (mxn):");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][]a=new int[m][n];
        
        System.out.println("Enter the matrix:");
        for(i=0;i<m;i++)
        {
            System.out.println("Enter row "+(i+1));
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Before Transpose:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");            
            }
            System.out.println("");
        }

        System.out.println("After Transpose:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[j][i]+" ");            
            }
            System.out.println("");
        }
        
    }
}