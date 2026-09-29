import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nWELCOME TO YOUR GAMES!!");
        Scanner scanInput = new Scanner(System.in);
        char choice;
        choice = menu(scanInput);
        
        while (choice != 'Q'){
            //test for choice type and call appropriate Game
            if (choice == 'R')
                Games.rockpaperscissors(scanInput);
            else if(choice == 'S')
                Games.scraps(scanInput);
            else if(choice == 'B')
                Games.blackjack(scanInput);
            else if(choice == 'H');
                Games.hangman(scanInput);

            //ask to play again? Show menu & get choice
            System.out.println("Do you want to play again?");
            choice = menu(scanInput);
        }

        scanInput.close();

    }

    public static char menu(Scanner scanInput){
        char choice = 'Q';
        String inputString;

        //menu loop
        //   print menu
        
        //   prompt user, get response & convert to upper case
        System.out.println("\n\nPlease choose a game to play: ");
        System.out.println("R - Rock, Paper, Scissors");
        System.out.println("S - Scraps");
        System.out.println("B - Blackjack");
        System.out.println("H - Hangman");
        System.out.println("Q - Quit");
        inputString = scanInput.nextLine();
        choice = inputString.toUpperCase().charAt(0);

        //   verify that the choice is R, S or Q 
        while (choice != 'R' && choice != 'S' && choice != 'B' && choice != 'Q' && choice != 'H'){
            System.out.println("Invalid input. Please enter R, S, B, or Q");
            inputString = scanInput.nextLine();
            choice = inputString.toUpperCase().charAt(0);
        }
 
        return choice;
    }
}


