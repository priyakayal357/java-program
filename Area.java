import java.io.*;
class Area
{
 public static void main(String arg[])
 {
  try
  {
   InputStreamReader isr = new InputStreamReader(System);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("Square& Rectangle");
   System.out.println("------------------");
   System.out.println("Enter the a value:");
   String s1 = br.readLine();
   int a=Integer.parseInt(s1);
   System.out.println("Enter the L value:");
   

   