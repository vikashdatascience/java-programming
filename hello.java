import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY MULTI-DIGIT NUMBER HERE ");
        long N = sc.nextInt();

        int count = 0;

        while(0<N)
        {
            N = N/10;
            count++;
        }
        System.out.println("number of digit : " + count);
        sc.close();

    

}
}