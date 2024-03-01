package myplaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {



	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		User user1=new User("Ann");
		User user2=new User("Bibin");
		List<User> userlist=new ArrayList<>();
		userlist.add(user1);
		userlist.add(user2);
		int choice;

		do

		{
			
			System.out.println("Please select one of the option");
			System.out.println("1.Add Song for a user");
			System.out.println("2.exit");
			choice =s.nextInt();
			switch(choice)
			{

			case 1:
				System.out.println("Enter name of the user");
				String name=s.next();
				int index=User.getUserIndex(userlist, name);
				System.out.println("Enter song");
				String songname=s.next();
				userlist.get(index).addSong(songname);

			case 2:

				break;

			}
		

		}while(choice!=2);

	}

}
