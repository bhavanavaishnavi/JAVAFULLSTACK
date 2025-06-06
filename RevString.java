class RevString
{
public static void main(String args[])
{
   String a = "java"; 
   StringBuilder s= new StringBuilder(a);
   s.reverse();
   String b = s.toString();      
   System.out.println("original:"+a);
   System.out.println("Reverse:"+b);
    }
}