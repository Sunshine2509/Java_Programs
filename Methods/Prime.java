// Java program to print 1 to 100 even numbers using user-defined method(Recursion).

import java.util.Scanner;

class Prime
{
static int num;
static int i=2;
static boolean flag=true;

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
prime();
System.out.println(flag?"Prime":"Not Prime");
}
public static void prime()
{
if(i==num)
return;


if(num%i==0)
{
flag=false;
}
i++;

return;
prime();
}
}
