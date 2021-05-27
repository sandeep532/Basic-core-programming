import java.util.Scanner;
public class Leapyear{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a;
System.out.println("Enter Year");
a=s.nextInt();
if(a==0)
{
System.out.println("Year Is ZERO");
}else if(a%400==0){
System.out.println(a+"Is Leap Year");}
else if(a%100==0){
System.out.println(a+"Is not Leap Year");}
else if(a%4==0){
System.out.println(a+"Is a leap Year");
}else
{
System.out.println(a+"Is not a Leap Year");}

}

}