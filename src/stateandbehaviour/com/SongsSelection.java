package stateandbehaviour.com;
import java.lang.*;
import java.util.*;
import java.io.*;

public class SongsSelection {
	
	public void selection()
	{
		Integer list,ch;
		TeluguSongs tlist=new TeluguSongs();
		BollywoodSongs blist=new BollywoodSongs();
		System.out.println("Enter which songs list you want\n" +
				"1.TeluguSongs List\n" +
				"2.BollywoodSongs List\n" +
				"3.Exit\n");
		Scanner input=new Scanner(System.in);
		       
		  while(input.hasNextInt())
		  {
			  list=input.nextInt();
			   switch(list)
			   {
			   case 0:
			   case 1:
				   tlist.telugusongslist();
				   break;
			   case 2:
				   blist.bollywoodsongslist();
				   break;
			   case 3:
				   System.out.println("Exit");
				   break;
				   
				default:
					System.out.println("There is no such option in this list\n");
				    break;
				   
			   }
			   
		  }
		   
		      /* if(list==1)
		       {
		    	   tlist.telugusongslist();
		    	   
		       }
		      if(list==2)
		      {
		    	  blist.bollywoodsongslist();
		    	  
		    	 
		      }*/
		       
	}
		 public static void main(String args[])
		 {
			 SongsSelection ss=new SongsSelection();
			 ss.selection();
		 }
		
	

}
