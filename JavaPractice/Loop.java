import java.util.Scanner;


public class Loop {
 
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter number of columns: ");
    int columns = sc.nextInt();
    System.out.println("Enter a symbol: ");
    String symbol = sc.next();

    for(int i = 1; i<=rows; i++){
        System.out.println();
            for(int a =1; a<=columns; a++){
                System.out.println(symbol);

            }
    }
    
}
}
   