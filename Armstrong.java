import java.util.*;
class Armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int s=0;
System.out.println("enter a number");
int n=sc.nextInt();
int m=n,r;
while(n!=0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(s==m)
{
System.out.println("armstrong");
}
else
{
System.out.println("not armstrong");
}
sc.close();
}
}

