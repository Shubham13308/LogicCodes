import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,fact=1;
        System.out.println("Enter the number to check the factorial");
        int number=sc.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}