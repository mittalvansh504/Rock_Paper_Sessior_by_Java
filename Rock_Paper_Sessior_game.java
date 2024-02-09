import java.util.*;

public class Rock_Paper_Sessior_game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // int n1=7;
        // 0 for rock
        // 1 for paper
        // 2 for sessior
        String a = "Rock";
        String b = "Paper";
        String c = "Sessior";
        
        System.out.println("Select any Rock, Paper, Sessior:- ");
        String val = sc.nextLine();
        int ran = rand.nextInt(3);
        System.out.println("Entry enter by the computer:- " + ran);
        if (ran == 0 && val == b || ran == 1 && val == c || ran == 2 && val == a) {
            System.out.println("You win");
        }
        else if (ran == 0 && val == a || ran == 1 && val == b || ran == 2 && val == c) {
            System.out.println("Tie");
        }
        else {
            System.out.println("You loss");
        }
    }
}
