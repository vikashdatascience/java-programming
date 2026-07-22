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