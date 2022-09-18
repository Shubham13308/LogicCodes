import java.util.Scanner;

public class Swapping_2variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to swap");
        int x= sc.nextInt();
        int y= sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Swapping the numbers"+x);
        System.out.println("Swapping the numbers"+y);

    }
}
