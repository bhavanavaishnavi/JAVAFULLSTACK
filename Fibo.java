class Fibo
{

public static void main(String args[])
{
  int n = 10;
  int a = 0;
  int b = 1;
   System.out.println("Fibonacci Series:");
   System.out.println(a+" "+b);

   for(int i=2;i<n;i++)
   {
    int t=a+b;
    System.out.print(" "+t);
    a = b;
    b =t;
   }
}
}
