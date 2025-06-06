class Prime
{
public static void main(String args[])
{
int num=20;
 boolean isPrime = true;
 for(int i=2;i<=num/2;i++) {
      if(num%i==0) {
             isPrime = false;
             break;
            }
        }
         if (num<=1) {
            isPrime = false;
        }
if(isPrime)
{
 System.out.println("it is prime");
}
else
{
 System.out.println("it is not prime");
}
}
 }     