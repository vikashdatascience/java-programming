import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=N; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
            else{
                continue;
            }
        }
        System.out.println("Sum of even numbers : " + sum);
        sc.close();
}
}
----------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int multiplication = 1;

        for(int i = 1; i<=10; i++)
        {
            
            System.out.println(N + "*" + i + "=" + (N * i));

            
        }
       
        sc.close();

     
}
}

----------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= N; i++)
        {
            if(N % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
----------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int reverse = 0;

        while(0<N)
        {
            int digit = N % 10;
            reverse = reverse * 10 + digit;
            N = N / 10;
        }
        System.out.println("reverse : " + reverse);
        sc.close();

    

}
}
----------------------------------------------------------------------------------------------------

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