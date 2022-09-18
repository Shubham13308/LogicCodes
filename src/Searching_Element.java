import java.util.Scanner;

public class Searching_Element {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
int[] ar=new int[5];
int p=0;
int i;
for(i=0;i<5;i++){
    System.out.println("Enter the array element");
    ar[i]=sc.nextInt();

}
        System.out.println("Array Element are");
for(i=0;i<5;i++){
    System.out.println(ar[i]);
}
        System.out.println("Enter the element you want to find");
int ser=sc.nextInt();
for(i=0;i<5;++i){
    if(ar[i]==ser){
        ++p;
    }

}
if(p>0){
    System.out.println("Element is found");
}
else{
    System.out.println("Element is not found");
}
    }
}
