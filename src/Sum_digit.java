import java.util.*;
class Sum_digit{
public static void main(String[] args){
System.out.println("This is main() method");
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=sc.nextInt();
int sum=0;
while(n>0){
sum+=n%10;
n/=10;
}
System.out.println("Sum of digit="+sum);
}
}
void show(){
  System.out.println("This is show() method");
  System.out.println("show() completed");
}