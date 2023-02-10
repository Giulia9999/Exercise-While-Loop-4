import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        System.out.println("Welcome!");
        int min = 1;
        int max = 10;
        int number = (int) Math.floor(Math.random() *(max - min + 1) + min);
        System.out.print("Guess the number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();

        while(guessNumber != number){
            System.out.print("Guess the number between 1 and 10: ");
            guessNumber = scanner.nextInt();
        }
        System.out.println("Congratulations!");
    }
}
