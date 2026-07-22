public class main{
    public static void main(string[] args){
        system.out.println("hello world");  
    }
}
===========================================================================================
public class hello{
    public static void main(string[] args){
        system.out.println("my name is vikash"):
    }
}
-------------------------------------------------------------------------------------------
public class hello{
    public static void main(string[] args){
        int age = 20;
        system.out.println(age);
    }
}
-------------------------------------------------------------------------------------------
public class hello{
    public static void main(string[] args0){
        int a = 2000000;
        byte b = 18;
        short c = 12200;
        long d = 2000000000l;
        float e = 20.2f;
        double f = 20.00020202;
        boolean g = true;
        char h = 'a';
        system.out.println(a);

    }


}
-------------------------------------------------------------------------------------------
import java.util.date;
public class hello{
    public static void main(string[] args){
        date today = new date();
        system.out.println(today);
        
    }
}
-------------------------------------------------------------------------------------------  
import java.util.Date;
public class hello{
    public static void main(String[] args){
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        p1.x = 20;
        System.out.println(p1);
        System.out.println(p2);

        
    }
}
-------------------------------------------------------------------------------------------

public class Hello{
    public static void main(String[] args)
    {
        int a = 25;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = (float)a / (float)b;
        System.out.println("addition of a and b is " + c);
        System.out.println("subtraction of a and b is " + d);
        System.out.println("multiplication of a and b is " + e);
        System.out.println("division of a and b is " + f);

    }
}
-------------------------------------------------------------------------------------------

public class Hello{
    public static void main(String[] args)
    {
        int a = 25;
        a++;
        system.out.println(a);
        a--;
        system.out.println(a);

        system.out.println(--a);
        system.out.println(a);

-------------------------------------------------------------------------------------------

public class booleandemo{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        system.out.println(!a);
        system.out.println(a && b);
        system.out.println(a || b);

    }
}
-------------------------------------------------------------------------------------------
public class hello{
    public static void main(String[] args){
       int num = 27;

       if(num %2 == 0)
       {
        if(num>20)
        {
            System.out.println(num + " is even and greater than 20");
        }
        else
        {
            System.out.println(num + " is even and less than or equal to 20");
        }
        
       } 
       else if(num % 2 != 0)
       {
        System.out.println(num + " is odd");
       }
       else
       {
        System.out.println(num + "is zero");
       }

        
    }

}
-------------------------------------------------------------------------------------------

public class hello{
    public static void main(String[] args){
       char attentance = "A";

       switch(attentance) 
       {
        case 'A':
            System.out.println("Absent");
            break;
        case 'P':
            System.out.println("Present");
            break;
        default:
            System.out.println("Invalid");
            break;        
       }

      
        
    }

}
-------------------------------------------------------------------------------------------

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {0, 0},
            {0, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
-------------------------------------------------------------------------------------------
package com.example;

public class hello {
    public static void main(String[] args) {

        int[][] arr = {
            {5, 6, 7},
            {7, 5, 6},
            {8, 9, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
-------------------------------------------------------------------------------------------
public class Laptap {

    String brand = "Dell";
    int ram = 8;
    int price = 55000;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Price : Rs." + price);
    }

    public static void main(String[] args) {

        Laptap obj = new Laptap();

        obj.display();
    }
}

-------------------------------------------------------------------------------------------

public class hello {
    public static void main(String[] args)
    {
        for(int i = 0; i<=5; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }
        }
    }
}
-------------------------------------------------------------------------------------------

import java.util.Scanner;


public class hello {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i<=N; i++)
        {
            System.out.println(i);
            
        }
    }
}
-------------------------------------------------------------------------------------------
 
import java.util.Scanner;

public class hello{
    public static void main(String[] args){

        for(int i = 1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class hello {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i<=30; i++)
        {
            if(i % N  == 0)
            {
                System.out.println(i);
            }
            
        }
        sc.close();

    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------

  import java.util.Scanner;
public class hello{
 
    public static void main(String[] args)
    {
        boolean prime = true;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N< 0)
        {
            prime = false;
            
        }else{

           
            for(int i = 2; i <= N-1; i++)
        {
            if(N % i == 0)
            {
                prime = false;
                break;
            }
           
            }
        if(prime){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not a prime");
        }
        sc.close();

    }
 }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class hello{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n >> 2);
        system.out.println(n << 2);



    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class hello{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       int n1 = sc.nextInt();
       int n2 = sc.nextInt();

       int big = (n1>n2)? n1 : n2;
       System.out.println( "biggest is "+ big);






    }
}
--------------------------------------------------------------------------------------------
public class hello {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\nBitwise AND (&)");
        System.out.println("a & b = " + (a & b));

        System.out.println("\nBitwise OR (|)");
        System.out.println("a | b = " + (a | b));

        System.out.println("\nBitwise XOR (^)");
        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("\nBitwise Complement (~)");
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
    }
}

--------------------------------------------------------------------------------------------

public class hello{
    public static void main(String[] args)
    {
        int n = 5;
        int sum = 0;

        for( int i = 0; i<n; i++ )
        {
            sum += i;
        }
        System.out.println("sum of the number" + sum);
    }
}
--------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i<=N)
        {
            sum += i;
            i++;
        }
        System.out.println("SUM OF THE NUMBER IS " + sum);

        sc.close();
    }
}

----------------------------------------------------------------------------------------------------


public class hello{
    public static void main(String[] args)
    {
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                System.out.println(i+ " "+j);
            }
        }
    }
}

----------------------------------------------------------------------------------------------------

public class hello{
    public static void main(String[] args)
    {
        int[] rollno = new int[10];

        rollno[4] = 5;
        rollno[1] = 1;

        System.out.println(rollno[4]);
        System.out.println(rollno[1]);
    }
}
----------------------------------------------------------------------------------------------------
public class hello{
    public static void main(String[] args)
    {
        int[][] matrix = new int[5][5];

        matrix[0][1] = 5;
        matrix[0][2] = 4;

        System.out.println(matrix[0][1]);
}
}
----------------------------------------------------------------------------------------------------

public class hello{
    public static void main(String[] args)
    {
        int[] array = new int[5];

        for(int i = 0; i<5; i++)
        {
            System.out.println(array[i]);
        }
}
}
----------------------------------------------------------------------------------------------------

public class hello{
    public static void main(String[] args)
    {
        int[][] array = new int[5][5];

        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
}
}
----------------------------------------------------------------------------------------------------

import java.util.Scanner;

class Movie {

    void recommend(String genre) {
        if (genre.equals("ACTION")){
            System.out.println("Recommended: LEO");
        }
        else if (genre.equals("COMEDY")){
            System.out.println("recommended: JAILER");
        }
        else if (genre.equals("FEEL GOOD")){
            System.out.println("Recommended: 96");
        }
        else if (genre.equals("ADVENTURE"))
        {
            System.out.println("Recommended: PULI");
        }    
    }
}

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie m = new Movie();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        m.recommend(genre);
    }
}
----------------------------------------------------------------------------------------------------

import java.util.Scanner;

class Movie {

    void recommend(String genre) {
        if (genre.equals("ACTION")){
            System.out.println("Recommended: LEO");
            System.out.println("Recommended: VIKRAM");
            System.out.println("Recommended: COOLIE");
        }
        else if (genre.equals("COMEDY")){
            System.out.println("recommended: JAILER");
            System.out.println("Recommended: FRIENDS");
            System.out.println("Recommended: DD RETURNS");
        }
        else if (genre.equals("FEEL GOOD")){
            System.out.println("Recommended: 96");
            System.out.println("Recommended: MEIYAZHAGAN");
            System.out.println("Recommended: GOOD NIGHT");
        }
        else if (genre.equals("ADVENTURE"))
        {
            System.out.println("Recommended: PULI");
            System.out.println("Recommended: PIRATES OF THE CARIBBEAN");
            System.out.println("Recommended: JUMANJI");

        }    
    }
}

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie m = new Movie();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        m.recommend(genre);
    }
}
----------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 1; i<=3; i++)
        {
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, n);

            
           
    }
    System.out.println("================================");
}
}
----------------------------------------------------------------------------------------------------






 