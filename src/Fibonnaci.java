import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        System.out.println("Enter the range you want to print fibonaaci series");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }
    }

}
