import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int board[][]=new int[n][n];
        // Arrays.fill(board, 0)
        print(board, n);
        if(start(board, n)==true)
        print(board, n);
    }
    static void print(int [][]board,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean start(int [][]board,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {if(check(board, i, j, n)==true)
                {  board[i][j]=1;
                   if( start(board, n)==true)
                   return true;
                   else 
                   board[i][j]=0;
                }
                return false;
            }
            }
        }
        return true;
    }
    static boolean check(int[][]board,int p,int q,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(board[p][i]==1)
                return false;
            if(board[i][q]==1)
                return false;
        }
        if(p==q)
            for(int k=0;k<n;k++)
        {
            if(board[k][k]==1)
            return false;
        }
        else
        for(int i=Math.abs(p-q),k=0;i<n && k<n;i++,k++)
        {
            if(board[i][k]==1)
            return false;
        }
        
        for(int i=p+q,k=0;i>=0 && k<n;i--,k++)
        {
            if(board[i][k]==1)
            return false;
        }
        return true;
    }
    
}
