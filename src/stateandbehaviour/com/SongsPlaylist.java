package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class SongsPlaylist {
	
	public String titlename="";
	static ArrayList<Data> songslist=new ArrayList<Data>();
	
	
	public SongsPlaylist(String titlename)
	{
		this.titlename=titlename;
	}
	public void addsongs(Data song)//How to pass argument to this method?Data is a Class Type
	{
	//	Data songcollection=new Data();
		//songcollection=song;
		
		songslist.add(song);
		
	}
	 public ArrayList<Data> getsongs()
	{
		return songslist;
	}
	 public String toString()
	 {
		 return "Title-name\t"+titlename+ "\tsongs"+songslist;
	 }
	public static void main(String args[])
	{
		
		//Scanner input=new Scanner(System.in);
		
		Data songs1=new Data();
		songs1.setSingerName("suneetha");
		songs1.setSongLine("eevelalo neevu em chestu untavo");
		songs1.setLengthOfSong(3);
		
		Data songs2=new Data();
		songs2.setSingerName("chitra");
		songs2.setSongLine("ninnu kori varnam");
		songs2.setLengthOfSong(5);
		
		SongsPlaylist teluguplaylist=new SongsPlaylist("TeluguPlaylist");
		teluguplaylist.addsongs(songs1);
		teluguplaylist.addsongs(songs2);
		
		//System.out.println(teluguplaylist);
		
		/*System.out.println("print the details");
		
		songs1.printData();//calls the printData() in Data Class
		System.out.println("list:"+songs1);//this directly prints the data in toString() of Data Class*/
		System.out.println("Singer Name\t\tLength of the song\t\tLine of the Song");
		/*for(Data d:songslist)
		{
			
			System.out.println(d.getSingerName()+"\t\t"+d.getLengthOfSong()+"\t\t"+d.getSongLine());
			/*or
			System.out.println(d);->it will automatically call toString() in Data class*/
	//	}*/
		
		for(int i=0;i<songslist.size();i++)
		{
			System.out.println(songslist.get(i)+"\n");
		}
		
	}

}
