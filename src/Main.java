import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        String redEyes;
        Scanner keyboard = new Scanner(System.in);
        redEyes = keyboard.next();
        do {
            if (redEyes.equalsIgnoreCase("Y")) {
                System.out.println("Get some sleep!");
                redEyes=keyboard.next();
        }
               } else{
            System.out.println("You look great!");
    }
    }
}
