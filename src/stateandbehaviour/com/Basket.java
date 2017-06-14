package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Basket {
	//Basket class
	public void addingtwoclasses()
	{
		Ball ball=new Ball();
		Bat bat=new Bat();
		ball.ballcolor("green");
		ball.ballsize(30.2);
		bat.changecolor("yellow");
		bat.changesize(15.5);
		
	}
	
	public static void main(String args[])
	{
		
		Basket basket=new Basket();
		basket.addingtwoclasses();
		
	}

}
