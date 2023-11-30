import java.util.Scanner;

class hangman {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String input;
        int strikes = 0;
        boolean s = false;
        boolean e = false;
        boolean c = false;
        boolean r = false;
        boolean t = false;
        

        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.println("Strikes: " + strikes + "/8");
            System.out.println(" ");
            if (s == true) {
                System.out.print("s ");
            } else {
                System.out.print("_ ");
            }
            if (e == true) {
                System.out.print("e ");
            } else {
                System.out.print("_ ");
            }
            if (c == true) {
                System.out.print("c ");
            } else {
                System.out.print("_ ");
            }
            if (r == true) {
                System.out.print("r ");
            } else {
                System.out.print("_ ");
            }
            if (e == true) {
                System.out.print("e ");
            } else {
                System.out.print("_ ");
            }
            if (t == true) {
                System.out.println("t ");
            } else {
                System.out.println("_");
            }

            System.out.println(" ");
            
            if (s && e && c && r && t == true || strikes == 8) {
                break;
            }
            
            System.out.println("Guess a letter");
            input = scan1.nextLine();
            switch (input) {
                case "s":
                    s = true;
                    break;
                case "e":
                    e = true;
                    break;
                case "c":
                    c = true;
                    break;
                case "r":
                    r = true;
                    break;
                case "t":
                    t = true;
                    break;
                default:
                    strikes++;
            }
        }

        if (strikes == 8) {
            System.out.println("Better luck next time");
        } else {
            System.out.println("Congrats, you guessed the word");
        }

        scan1.close();
    }
}