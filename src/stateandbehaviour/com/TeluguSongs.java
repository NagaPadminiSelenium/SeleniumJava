package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class TeluguSongs {

	public void telugusongslist()
	{
		System.out.println("Telugu Songs List");
		System.out.println("1.Malli Malli idi rani roju\n" +
				"2.sir ostar ostare\n" +
				"3.nuvvu visileste andrasoda buddi");
	}
	public static void main(String args[])
	{
		TeluguSongs ts=new TeluguSongs();
		ts.telugusongslist();
	}
}
