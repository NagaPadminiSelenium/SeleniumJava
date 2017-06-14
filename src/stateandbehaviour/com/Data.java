package stateandbehaviour.com;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Data {
	
	private String singername;
	private int lengthofsong;
	private String songline;
	
	public Data()
	{
		this.singername=null;
		this.lengthofsong=0;
		this.songline=null;
		
	}
	
	public Data(String n,int l,String s)
	{
		this.singername=n;
		this.lengthofsong=l;
		this.songline=s;
		
	}
	public void setSingerName(String newSingerName)
	{
		this.singername=newSingerName;
	}
	public void setLengthOfSong(int newLengthOfSong)
	{
		this.lengthofsong=newLengthOfSong;
	}
	public void setSongLine(String newSongLine)
	{
		this.songline=newSongLine;
	}
	public String getSingerName()
	{
		return singername;
	}
	public int getLengthOfSong()
	{
		return lengthofsong;
	}
	public String getSongLine()
	{
		return songline;
	}
    public void printData()
    {
    	System.out.println("Singername\tLength of the song\t\t\tsongline");
		System.out.println(singername+"\t"+lengthofsong+"\t"+songline);
    }
    public String toString()
    {
		return this.getSingerName()+"\t"+this.getLengthOfSong()+"\t"+this.getSongLine();
    	
    }
}
