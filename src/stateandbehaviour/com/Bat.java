package stateandbehaviour.com;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Bat {
	//Bat class
	public String color1=null;
	public double size1=0.0;
	
	public void changecolor(String newcolor)
	{
		color1=newcolor;
		System.out.println("color of the bat is:"+color1);
	}
	public void changesize(double newsize)
	{
		size1=newsize;
		System.out.println("size of the bat is:"+size1);
	}
	public static void main(String args[])
	{
		//creating bat objects
		Bat bat1=new Bat();
		bat1.changecolor("orange");
		bat1.changesize(25.5);
		Bat bat2=new Bat();
		bat2.changecolor("blue");
		bat2.changesize(30.20);
	}

}
