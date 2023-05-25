import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        for(int i = 0 ; i<array.length; i++){
            int item = scanner.nextInt();
            array[i] = item;
        }
        
        for(int i = n - 1 ; i >= 0; i--){
            System.out.print(array[i] + " ");
            
        }
        scanner.close();
    }

}
