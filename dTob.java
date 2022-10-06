public class dTob {
    public static void main(String[] args){
        int decimal = 25;
        //integer array for storing binary digits
        int binary[] = new int[20];
        int i = 0;
        //writing logic for the conversion
        while(decimal > 0)
        {
            binary[i] = decimal % 2;
            decimal = decimal/2;
            i++;
        }
        //printing result
        System.out.print("Binary number : ");
        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(binary[j]+"");
    }
}
