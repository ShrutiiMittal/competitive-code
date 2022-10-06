import java.util.Scanner;

public class replace0t01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // convert number to string
        String str = Integer.toString(num);
        int len = str.length();
        String str1 = "";

        //logic to replace 0 with 1
        for(int i=0; i<len; i++){

            if(str.charAt(i)=='0')
                str1 = str1 + '1';
            else
                str1 = str1 + str.charAt(i);
        }
        System.out.println(" Updated number is : "+ str1);

    }
}
