package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Rectangle
{
   public int length;//instance variables(iv)
   public int breadth;//iv
   
   public Rectangle()
   {
	   //default constructor
   }
   public Rectangle(int length,int breadth)//these length and width are local variables
   {
	   this.length=length;//we use 'this' keyword to differentiate instance variables and local variables
	   this.breadth=breadth;
	   System.out.println("length is:"+this.length);
	   System.out.println("breadth is:"+this.breadth);
   }
   public Rectangle(Rectangle rec)
   {
	   this.length=rec.length;
	   this.breadth=rec.breadth;
	   System.out.println("length is:"+this.length);
	   System.out.println("breadth is:"+this.breadth);
   }
   
   public void setRectangle(Rectangle r)
   {
	   this.length=r.length;
	   this.breadth=r.breadth;
	   
	   System.out.println("length is:"+this.length);
	   System.out.println("breadth is:"+this.breadth);
   }
   
}


