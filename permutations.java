import java.util.Scanner;

public class permutations {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students looking for seats : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of seat available : ");
        int r = sc.nextInt();
        int permutation = fact(n)/fact(n-r);

        System.out.println(permutation);
    }
    static int fact(int num){
        if(num == 0)
            return 1;
        return (num*fact(num-1));
    }
}
