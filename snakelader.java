public class snakelader
{
	public static final int start_position=0;

	public static void main(String[] args)
	{
		int player=0;
		int player1=start_position;
		int player2=start_position;
		int count1=0;
		int count2=0;
		int turn=0;
		while(player != 100)
		{
			if(turn == 0)
			{
				player=player1;
				turn++;
			}
			else if(turn == 1)
			{
				player=player2;
				turn--;
			}

			int check_option = (int) Math.floor(Math.random()*10)%3; 
			System.out.println("the check option is :" +check_option);

			int dies = (int) Math.floor(Math.random()*6+1);
 			System.out.println("the value of dies is:" +dies);

			if(turn == 1)
			{
				count1++;
			}
			else if(turn == 0)
			{
				count2++;
			}
			switch(check_option)
			{
					case 1:
					 	System.out.println("LADDER");
					 	player=player+dies;
						System.out.println("player position is :"+player);
						break;

					case 2:
                				System.out.println("SNAKE");
						if(player<=0)
						{
							player=0;  //player1 starts from 0
						}
						else if(player>0)
						{
                                         		player=player-dies;
						}
                                        	System.out.println("player position is :"+player);
                                       		 break;
					default:
						System.out.println("no player");
			}
			if(turn == 1)
			{
				player1=player;
			}
			else if(turn == 0)
			{
				player2=player;
			}
			else
			{
				System.out.println("you are at player" +player);
			}

		}
		if(player1 == 100)
		{
			System.out.println("!!!!!!!!!!Player 1 win!!!!!!!!!!!!");
			System.out.println("total dies count is :"+count1);
		}
		else if(player2 == 100)
		{
			System.out.println("!!!!!!!!!!!!!!player2 win !!!!!!!!!!!!!!!!!!!!!");
			System.out.println("total dies count is :"+count2);
		}
	}
}
