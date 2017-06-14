package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class StringObjectPass {
	
	private String value="";
	
	public static void main(String args[])
	{
		StringObjectPass s=new StringObjectPass();
		s.value="sudhamani";
		System.out.println("value passing as an object to the method is:"+s.value);
		passedStringValue(s);
		
		
	}
	public static void passedStringValue(StringObjectPass sbp)
	{
		String value1="";
		value1=sbp.value;
		System.out.println("passed string value is:"+value1);
	}

}
