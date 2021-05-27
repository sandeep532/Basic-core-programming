import java.util.Scanner;
public class Power{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=s.nextInt();
System.out.println("Power of 2 "+n+"is:"+(Math.pow(2,n)));
for(int i=1;i<=n;i++){
System.out.println("Power of 2 "+i+"is:"+(Math.pow(2,i)));
}
}
}