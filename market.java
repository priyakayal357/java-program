import java.io.*;
class market
{
 public static void main(String arg[])
 {
  try
  {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("Arun Super Market");
   System.out.println("NO.6,Main Road,Villupuram");
   System.out.println("------------------------");
   System.out.println("BILL");
   System.out.println("------------------------");
   System.out.println("Enter The Seria NO:");
   String s1 = br.readLine();
   System.out.println("Enter The Particulars:");
   String s2 = br.readLine();
   System.out.println("Enter The Rate:");
   String s3 = br.readLine();
   int a = Integer.parseInt(s3);
   System.out.println("Enter The Quantity:");
   String s4 = br.readLine();
   int b = Integer.parseInt(s4);
   System.out.println("Result");
   int tot = a*b;
   System.out.println("Total Amount:"+tot);
   int c = tot*10/100;
   System.out.println("GST (10%):"+c);
   int g = tot+c;
   System.out.println("Grand Total:"+g);
   System.out.println("------------------------");
   System.out.println(" Thanks ! Visit Again!");
   System.out.println("----------***-----------");
   }
    catch(Exception e)
    {}
   }
}





   



   
   


   


