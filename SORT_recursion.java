 import java.util.*;
public class SORT_recursion{
    public static void main(String args[])
    {
        //Scanner sc= new Scanner (System.in);
        List<Integer> a=new ArrayList<Integer>();
        a.add(5);
        a.add(4);
        a.add(8);
        a.add(1);
        a=sort(a);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i));
    }

    static List<Integer> sort(List<Integer> a)
    {
        if(a.size()==1)
            return a;
        int n= a.get(a.size()-1);
        a.remove(a.size()-1);
        sort(a);
        insert(a,n);
        return a;
    }
    static void insert (List <Integer>a, int n)
    {
        if(a.size()==0 || (int)(a.get(a.size()-1))<=n)
        {
            a.add(n);
            return;
        }
        int x=(int)a.get(a.size()-1);
        a.remove(a.size()-1);
        insert(a, n);
        a.add(x);
        return;
    }
}