import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check the prime number");
        int num= sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=num/2;++i){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("It is a prime number");
        }
        else
            System.out.println("it is not a prime number");

    }
}