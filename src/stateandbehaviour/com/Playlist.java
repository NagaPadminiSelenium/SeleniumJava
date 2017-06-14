package stateandbehaviour.com;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Playlist {
	
	public String Titlename;
	ArrayList<String> songslist=new ArrayList<String>();
	
	
	public Playlist(String title)
	{
		Titlename=title;
	}
	
	public void addsongs(String addsong)
	{
		
		songslist.add(addsong);
		
	}
	public int getSize()
	{
		return songslist.size();
	}
	public ArrayList<String> getSongs()
	{
		return songslist;
	}
	
	public String toString() {
		return "title="+Titlename+"  songs:"+songslist;
	}

  public static void main(String args[])
  {
	  Playlist hindi=new Playlist("Hindi Songs");
	  Playlist telugu=new Playlist("Telugu songs");
	  
	  hindi.addsongs("Hum ko sirf");
	  hindi.addsongs("Tuje dekha");
	  hindi.addsongs("Megha baruso");
	  
	  telugu.addsongs("nee navvule");
	  telugu.addsongs("mela mellaga");
	  telugu.addsongs("em sandeham ledhu");
	  
	  
	  System.out.println("Telugu songs playlist"+telugu.getSongs());
	  System.out.println("Hindi songs playlist"+hindi.getSongs());
	  
	  System.out.println(" Playlist hindi "+hindi);
	  System.out.println(" Playlist telugu "+telugu);
	  
	  
  }  
  }


