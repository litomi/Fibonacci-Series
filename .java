import java.util.Scanner;
public class Fibo{
public static void main(String args[]){
int firstNum=0,secondNum=1,nextNum;
System.out.println("Enter the Number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("First"+n+"terms of Fibonacci series");
for(int i=1;i<=n;i++)
{
System.out.print(firstNum+", ");
nextNum=firstNum+secondNum;
firstNum=secondNum;
secondNum=nextNum;
}
}
}
