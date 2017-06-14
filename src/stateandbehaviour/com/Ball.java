package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Ball {
	// Ball class
	public String color=null;
	public double size=0.0;
	
	public void ballcolor(String addcolor)
	{
		color=addcolor;
		System.out.println("color of the ball is:"+color);
	}
	public void ballsize(double addsize)
	{
		size=addsize;
		System.out.println("size of the ball is:"+size);
	}
	public static void main(String args[])
	{
		//creating objects for a class
		Ball basketball=new Ball();
		Ball volleyball=new Ball();
		
		//calling /invoking methods using objects
		basketball.ballcolor("rainbow");
		basketball.ballsize(10.0);
		volleyball.ballcolor("grey");
		volleyball.ballsize(15.5);
	}

}
