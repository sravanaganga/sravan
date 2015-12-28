import java.lang.*;

public class Second
{
  public void printMessage()
   {
     System.out.println("Second file Executed");  
     Third tObject=new Third();
     tObject.printMessage();
   }
}
