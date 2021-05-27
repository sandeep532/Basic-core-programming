public class Swap{
public static void main(String args[]){
int a=20;
int b=30;
int temp;
//Swaping of two numbers using thirs variable
System.out.println("Before Swaping " +a+""+b);
temp=a;
a=b;
b=temp;
System.out.println("After Swaping "+a+""+b);
//Swaping of two variables without using 3rd variable
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swaping with out using third vsariable "+a+""+b);

}

}