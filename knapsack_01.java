public class knapsack_01 {
    // print max value which can be achieved with given weight
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        System.out.println(knapsack(4,7,val,wt));
    }
    // public static int knapsack(int wt[],int val[],int w,int n)
    // {
    //     if(n==0|| w==0)
    //         return 0;
    //     if(wt[n-1]<=w)
    //         return Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
    //     else
    //         return knapsack(wt,val,w,n-1);
    // }

    public static int knapsack(int n,int w,int[]val,int []wt)
    {
        int t[][]=new int[n+1][w+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(wt[i-1]<=j)
                t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                else
                t[i][j]=t[i-1][j];
            }
        }
        return t[n][w];
    }
}
