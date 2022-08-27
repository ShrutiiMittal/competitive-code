
//import java.util.*;
public class maxReach {
public static void main(String[] args) {
    int a[]={2, 4, 6, 2, 6, 7,4,2,1};
   // int n=a.length;
    int mReach=a[0];
    int steps=a[0];
    int jump=1;
    for(int i=1;i<a.length;i++)
    {
        if(i==a.length-1)
        {
            System.out.print(jump);
            return;
        }
        mReach=Math.max(mReach,a[i]+i);
        steps--;
        if(mReach<i)
        {
            System.out.println("-1");
            return;
        }
        if(steps==0)
        {
            jump++;
            steps=mReach-i;

        }

    }
    System.out.println("-1");
}    
}
