package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 * @author suzanaguleva
 */
public class TestUserProfile {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your user ID: ");
        String userID = sc.nextLine();
        
        System.out.println("Choose your favourite genre of movies: Comedy, Drama, Action, Mystery");
        String genre = sc.nextLine();

        System.out.print("Your profile was created!");
    }
}
