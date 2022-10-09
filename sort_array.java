import java.util.*;
public class sort_array {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(5);
        a.add(5);
        a.add(8);
        a.add(1);
        a.add(3);
        sorts(a,a.size());
        System.out.print(a);
    }
    static void sorts(List<Integer> a,int n){
        if(n==1)
        {
            return;
        }
        int p=(int)a.get(n-1);
        a.remove(n-1);
        sorts(a,n-1);
        insert(a,p,n-1);
      //  return;
    }
    
    static void insert(List<Integer> a,int p,int n)
    {
        if(a.size()==0||(int)a.get(n-1)<p)
        {
            a.add(p);
            return;
        }
        int tmp=(int)a.get(n-1);
        a.remove(n-1);
        insert(a,p,n-1);
        a.add(tmp);
       // return;
    }

}
