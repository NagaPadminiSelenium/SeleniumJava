package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class RectangleMain {
	
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle();
		r2.setRectangle(r1);//here we are storing lenght and breadth of r1 in length and breadth of r2
		
		Rectangle r3=new Rectangle(r1);//here we are storing length of r1 in length of r3 and breadth of r1 in breadth of r3
	}

}
