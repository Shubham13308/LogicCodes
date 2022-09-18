import java.util.Scanner;
import java.util.*;
public class Seperate_Even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      int  n=5;
      int j=0,k=0;
       int a[]=new int[n];
       int odd[]=new int[n];
       int even[]=new int[n];
        System.out.println("Enter all the element in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                odd[j]=a[i];
                j++;
            }
            else{
                even[k]=a[i];
                k++;
            }
        }
        System.out.println("odd");
        if(j>1){
            for(int i=0;i<(j-1);i++){
                System.out.print(odd[j]+" ");
            }
            System.out.print(odd[j-1]);
        }
        else{
            System.out.println("no number");
        }
        System.out.println(" ");
        System.out.println("Even:");
        if(k>1){
            for(int i=0;i<(k-1);i++){
                System.out.print(even[i]+", ");
            }
            System.out.println(even[k-1]);
        }
        else{
            System.out.println("no number");
        }
    }

}
