import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();

        for (int i = 0; i < howMany; i++) {
            String inputString = scanner.next();
            evenOdd(inputString);
        }


    }

    public static void evenOdd(String S) {
        String evenString = "";
        String oddString = "";
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                evenString = evenString + S.charAt(i);
            } else {
                oddString = oddString + S.charAt(i);
            }
        }
        System.out.println(evenString + " " + oddString);
    }
}