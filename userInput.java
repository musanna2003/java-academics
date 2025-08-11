import java.util.Scanner;

public class userInput {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("inter your name : ");
        String nam = sc.nextLine();
        System.out.println("hi " + nam);
    }
}
