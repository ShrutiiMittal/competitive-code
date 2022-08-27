import java.util.*;
class prime{
    public static void main(String args[])
    {
        int n=8;
        findPrime(70);
        // for(int i=2;i<=Math.sqrt(n);i++)

        // {
        //     if(n%i==0)
        //         {
        //             System.out.println("false");
        //             return;
        //         }
        // }
        // System.out.println("true");
    }
    public static void findPrime(int n)
    {
        int a[]=new int[n+1];
        for(int i=2;i<=n;i++)
        {
            if(a[i]==0)
            for(int j= 2;(i*j)<n;j++)
            {
                a[i*j]=1;
            }
        }
        for(int k=2;k<n;k++)
        if(a[k]==0)
        System.out.print("\t"+k);
    }
}
//check for prime