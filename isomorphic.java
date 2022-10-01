import java.util.*;

public class isomorphic {
    public static void main(String[] args) {
        String s="egg";
        String t="foo";
        if(s.length()!=t.length())
            //return false;
        System.out.println("false1");
        HashMap<String,String> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(String.valueOf(s.charAt(i))))
            {
                String c1=hm.get(String.valueOf(s.charAt(i)));
                if(!c1.equals(String.valueOf(t.charAt(i))));
                   // return false;
                    System.out.println(" if block -false2");
            }
            else{
                hm.put(String.valueOf(s.charAt(i)),String.valueOf(t.charAt(i)));
                System.out.println("else blck");
            }
        }
        System.out.println(hm);
        // return true;
        System.out.println("true");
    }
}
