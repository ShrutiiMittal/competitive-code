import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static boolean isAnagrams(String str1, String str2){
        String s1=str1.replaceAll("[\\s]", "");
        String s2=str2.replaceAll("[\\s]", "");
        boolean status = true;

        if(s1.length() != s2.length())
            return false;
        else{
            char c1[] = s1.toLowerCase().toCharArray();
            char c2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            status = Arrays.equals(c1,c2);
        }
        return status;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.next();
        String str2 = sc.next();
        boolean status = isAnagrams(str1, str2);
        if(status==true){
        System.out.println("Anagram");}
        else{
            System.out.println("Not Anagram");
        }
    }
}
