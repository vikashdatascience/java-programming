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
        else if(genre.equals("WEB SERIES"))
        {
            System.out.println("Recommended: GAME OF THRONES");
            System.out.println("Recommended: BREAKING BAD");
            System.out.println("Recommended: STRANGER THINGS");

        }  

    }
}

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie m = new Movie();

        System.out.print("Enter Genre: (WEB SERIES,  ADVENTURE, FEEL GOOD, COMEDY, ACTION)   ");
        String genre = sc.nextLine();

        m.recommend(genre);
    }
}