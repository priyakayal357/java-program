import java.io.*;
class arithic
{ 
  public static void main(String arg[])
  {
    try
    {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   System.out.println("ARITHEMATIC OPERATION");
   System.out.println("----------------------");
   System.out.println("Enter the First Number:");
   String s1 = br.readLine();
   int a = Integer.parseInt(s1);
   System.out.println("Enter the Second Number:");
   String s2 = br.readLine();
   int b = Integer.parseInt(s2);
   System.out.println("Result");
   int c = a+b;
   System.out.println("Add:"+c);
   c = a-b;
   System.out.println("sub:"+c);
    }
    catch(Exception e)
    {}
   }
}

