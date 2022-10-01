public class insertion_sort{
    public static void main(String[] args) {
        int a[]={9,6,7,4,0,-6,-2};
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int tmp=a[i];
            int j=0;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>tmp)
                {
                    a[j+1]=a[j];
                }
                else
                     break;
            }
            a[j+1]=tmp;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}
