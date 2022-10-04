import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem,rev=0;
        System.out.println("Enter the number to reverse");
        for(int n=sc.nextInt();n!=0;n/=10){
rem=n%10;
rev=rev*10+rem;

        }
        System.out.println(rev);
    }
}
