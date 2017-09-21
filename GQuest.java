//x = your health, r = coins, b = enemy's health, g = gems
import java.util.Scanner;
import java.util.Random;

public class GQuest
{
	public static void main(String[] args) {
	int x = 50;
	int r = 100;
	int g = 15;
	System.out.println("|\n|\n|\n|\n|\n|\n|                        \u001B[1m G--QUEST\u001B[0m\n|\n|                        0 to START\n|\n|\n|\n|\n|\n|");
	Scanner choice = new Scanner(System.in);
	int c = choice.nextInt();

										//HOME SCREEN

	if(c == 0)
	{
	g += 1;
	r += 15;
	//12 spaces, 8 dashes, 1 space, 1 line, 6 spaces

	System.out.println("  |Health: " + x + "         Coins: " + r + "         Gems: " + g + "|\n");
	System.out.println("             ________  |[6] ^^|  ________             \n            |        | |      | |        |            \n            |[0] Shop| |      | |[1] Home|            \n            |        | |      | |        |            \n[4] <--      --------  |      |  --------      --> [5]\n-----------------------        -----------------------\n\n\n-----------------------        -----------------------\n             ________  |      |  ________             \n            |        | |      | |        |            \n            |[2]Bonus| |      | |[3] Save|            \n            |        | |      | |        |            \n             --------  |[7] vv|  --------             ");
	
	Scanner choice4 = new Scanner(System.in);
	int h = choice4.nextInt();
	
										//STORE


		if(h == 0)
		{
		System.out.println("Welcome to the store! What would you like to buy?\n|[0] Armor\n|[1] Potions\n|[2] Weapons\n|[3] Exit");
	
			Scanner choice5 = new Scanner(System.in);
			int j = choice.nextInt();

										//ARMOR

				if(j == 0)
				{
				System.out.println("|[0] Super Light Armor - 50 coins\n|[1] Light Armor - 150 coins\n|[2] Heavy Armor - 7 gems\n|[3] Super Heavy Armor - 10 gems\n|[4] Back");
				Scanner choice6 = new Scanner(System.in);
				int s = choice6.nextInt();

										//ARMOR PURCHASE
	
					if(s == 0)
					{
					r -= 50;
					x += 10;
					System.out.println("Coins: " + r + "\nGems: " + g + "\nHealth: " + x);
					}
					if(s == 1)
					{
					r -= 150;
					x += 25;
					System.out.println("Coins: " + r + "\nGems: " + g + "\nHealth: " + x);
					}
					if(s == 2)
					{
					g -= 7;
					x += 45;
					System.out.println("Coins: " + r + "\nGems: " + g + "\nHealth: " + x);
					}
					if(s == 3)
					{
					g -= 10;
					x += 70;
					System.out.println("Coins: " + r + "\nGems: " + g + "\nHealth: " + x);
					}
					if(s == 4)
                                  						//POTION

			if(j == 1){
				System.out.println("|[0] Health Restore - 100 coins\n|[1] Extra Damage\n|");
			}
			Scanner choice7 = new Scanner(System.in);
			int q = choice7.nextInt();
			}
}	
										//HOME SCREEN

        if(h == 1)
        {
	System.out.println(" ---------------------------\n(You currently have no home.)\n ---------------------------");
	}
	if(h == 2)
	{
	System.out.println(" -----------------------------------------------\n(There are no minigames available at the moment.)\n(Please try again later.                        )\n -----------------------------------------------");
	}
	if(h == 3)
	{
	System.out.println(" ----------------------------------------------\n(The save operation has not yet been completed.)\n ----------------------------------------------");
	}
	if(h == 4)
	{
	System.out.println(" -------------------------------------------------------\n(Oh no! There is a Magic Goblin! What do you want to do?)\n| [0] Attack                                            |\n| [1] Flee                                              |\n -------------------------------------------------------");

										//GOBLIN FLEE

		Scanner choice2 = new Scanner(System.in);
		int y = choice2.nextInt();
	
			if(y == 1)
        		{
        		while(true) {
        		System.out.println(" ---------------\n|You have fled. |\n|[0] Return Home|\n|[1] Exit Game  |\n ---------------");
			break;
        		}
        		}
	
										//GOBLIN ATTACK

			if(y == 0)
			{
			int b = 35;
			while(true) {
			System.out.println(" ------------------\n|Your Health: " + x + "   |\n|Enemy's Health: " + b + "|\n ------------------\n --------------------\n|Attacks:            |\n|[0] Kick            |\n|[1] Sword           |\n|[2] Heal            |\n --------------------");
				Scanner choice3 = new Scanner(System.in);
				int a = choice3.nextInt();
				if(a == 0)
				{
				b -= 5;
				System.out.println(" --------------------------------------\n|Enemy's Health: " + b + "                    |\n(The Goblin was hardly damaged.        )\n --------------------------------------");
				}
				if(a == 1)
				{
				b -= 15;
				System.out.println(" --------------------------------------\n|Enemy's Health: " + b + "                    |\n(The Goblin was heavily damaged.       )\n --------------------------------------");
				}
				if(a == 2)
				{
				x += 10;
					if(x <= 50)
					{
					System.out.println(" --------------------------------------\n|Your Health: " + x + "                       |\n(You've gained 10 Health.                 )\n --------------------------------------");
					}
					if(x == 55)
					{
					x -= 5;
					System.out.println(" ----------------------------------------\n|You've reached the maximum Health limit.|\n ----------------------------------------");
					continue;
					}
					if(x == 60)
					{
					x -= 10;
					System.out.println(" ----------------------------------------\n|You've reached the maximum Health limit.|\n ----------------------------------------");
					continue;
					}
					}
						break;}

										//GOBLIN TURN


//	System.out.println(" -------------------------\n(It's the Goblin's turn...)\n -------------------------");
	
//	if(bb == 0)
	{
//	x -= 10;
//	System.out.println(" -----------------------\n(The Goblin shanked you.)\n -----------------------");
	}
//	if(bb == 1)
	{
//	x -= 20;
//	System.out.println(" -----------------------------------\n(The Goblin threw a fireball at you.)\n|Health: " + x + "                         |\n -----------------------------------");
	}
//	if(bb == 2)
	{
//	x -= 5;
//	System.out.println(" ------------------------------------------------------\n(The Goblin said mean words. You were greatly offended.)\n|Health: " + x + "                                           |\n ------------------------------------------------------");
	}
	}
	  }
	 }
	}
