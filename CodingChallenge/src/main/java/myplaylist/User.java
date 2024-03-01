package myplaylist;

import java.util.List;

public class User {
	
	
	String name;
	String [] song= {"","",""};
	
	public User (String name)
	{

		this.name=name;
	}
	
	public void addSong(String songname)
	{  boolean f=false;
		for(int i=0;i<song.length;i++)
		{
			if(song.equals(""))
			{
			song[i]=songname;
			break;
			
			}
		}
		
		if(f==false)
		{for(int i=0;i<song.length-1;i++)
		{
		song[i]=song[i+1];
		
		}
		song[2]=songname;
			
		}
		
		
		printPlaylist();
	}

	public void printPlaylist() {
		
		System.out.println("The playlist");
		for(int i=0;i<song.length;i++)
		{
			System.out.println(song[i]);
			
			
		}
		
	}
	
	public static int getUserIndex(List<User> user,String name)
	{   

		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).name.equalsIgnoreCase(name))
			{

				return i;
			}

		}
		return 0;
	}
	
}
