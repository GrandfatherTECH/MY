:wq
import java.util.Scanner;
public class Main2 {
    public static void main(String[]args){
        Scanner my = new Scanner(System.in);
        int x = my.nextInt();
        ++x;
        switch (x) {
            case 1 -> System.out.println("Yes");
            case 0 -> System.out.println("No");
            case 2 -> {
                while (x == 2) {
                    System.out.println(x);
                    ++x;
                }
                System.out.println(x);
            }
            default -> System.out.println("Error");
        }
    }
       
