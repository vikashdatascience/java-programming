import java.util.Scanner;

class Movie {

    void action() {
        System.out.println("LEO");
        System.out.println("VIKRAM");
        System.out.println("COOLIE");
    }

    void comedy() {
        System.out.println("JAILER");
        System.out.println("FRIENDS");
        System.out.println("DD RETURNS");
    }

    void feelGood() {
        System.out.println("96");
        System.out.println("MEIYAZHAGAN");
        System.out.println("GOOD NIGHT");
    }

    void adventure() {
        System.out.println("PULI");
        System.out.println("PIRATES OF THE CARIBBEAN");
        System.out.println("JUMANJI");
    }
}

public class hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        if (genre.equalsIgnoreCase("ACTION"))
            m.action();
        else if (genre.equalsIgnoreCase("COMEDY"))
            m.comedy();
        else if (genre.equalsIgnoreCase("FEEL GOOD"))
            m.feelGood();
        else if (genre.equalsIgnoreCase("ADVENTURE"))
            m.adventure();
        else
            System.out.println("Invalid Genre");

        sc.close();
    }
}