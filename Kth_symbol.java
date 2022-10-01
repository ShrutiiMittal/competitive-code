import java.sql.Array;
import java.util.*;
public class Kth_symbol {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        add(5,a);
    }

    static void add(int n,List<Integer> a)
    {
        if(n==1)
        {
            // System.out.println("0");
            return;
        }

    }

    static void nott(List<Integer> a)
    {
        for(int i=0;i<a.size();i++)
        {
            a.add(a.get(i)^1);
        }
    }
}
