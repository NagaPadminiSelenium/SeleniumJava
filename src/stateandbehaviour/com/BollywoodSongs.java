package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class BollywoodSongs {
//Bollywood class
	public void bollywoodsongslist()
	{
		System.out.println("Bollywood songs List");
		System.out.println("1.Tere ishq bina\n" +
				"2.Ghar se nikalte\n" +
				"3.Barsaath\n" +
				"4.pardesi");
	}
	public static void main(String args[])
	{
		BollywoodSongs bs=new BollywoodSongs();
		bs.bollywoodsongslist();
	}
}
