public class Flipcoin{
public static void main(String args[]){
int head=0;
int tail=0; 
int n=10;
for(int i=1;i<=n;i++)
{double coin=Math.random();
if(coin<0.5){
head++;
//System.out.println(head);
}else{
tail++;
//System.out.println(tail);
}
}
int percenthead=(head*100)/10;
int percenttail=(head*100)/10;
System.out.println("Head Count" +head);
System.out.println("Tail Count" +tail);
System.out.println("Head Percentage" +percenthead);
System.out.println("Tail percentage" +percenttail);
        
}
}