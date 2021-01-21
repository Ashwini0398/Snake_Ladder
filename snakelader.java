public class snakelader
{
	public static final int start_position=0;

	public static void main(String[] args)
	{

		int player1=0;
		
		while(player1 !=100)
		{
			int check_option = (int) Math.floor(Math.random()*10)%3; 
			System.out.println("the check option is :" +check_option);

			int dies = (int) Math.floor(Math.random()*6+1);
 			System.out.println("the value of dies is:" +dies);

			switch(check_option)
			{
					case 1:
					 	System.out.println("LADDER");
					 	player1=player1+dies;
						System.out.println("player position is :"+player1);
						break;

					case 2:
                				System.out.println("SNAKE");
                                         	player1=player1-dies;
                                        	System.out.println("player position is :"+player1);
                                       		 break;
					default:
						System.out.println("no player");
			}
		}
		System.out.println("!!!!!!!!!!you win!!!!!!!!!!!!");
	}
}
