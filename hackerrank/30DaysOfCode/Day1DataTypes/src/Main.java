import java.util.*;

public class Main {

    public static void main(String[] args) {
       
       int a;
       double b;
       String c;
       
       Scanner scanner = new Scanner(System.in);
       
       a = scanner.nextInt();
       b = scanner.nextDouble();
       scanner.nextLine();
       c = scanner.nextLine();
       
       int i = 4;
       double d = 4.0;
       String s = "HackerRank ";
       
       System.out.println(a + i);
       System.out.println(b + d);
       System.out.println(s + c);

       scanner.close();
    }
}
