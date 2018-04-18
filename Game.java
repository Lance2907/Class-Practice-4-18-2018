import java.util.Scanner;
import java.util. Random;
public class Game {
	public static void main(String[]args){
		Scanner scan=new Scanner (System.in);
		Random rand=new Random();

		int Score=0;

while (true){
		System.out.println("Do you want to roll? 1=yes 2=no");
		if(scan.nextInt()==1){
			int numberRolled= rand.nextInt(6)+1;

			if (numberRolled!=1){
				Score=Score+numberRolled;
				System.out.println("your score is "+Score);
			}else{


				System.out.println("You lose");
				break;
			}
		}
		else{
			System.out.println("your final score is"+Score);
			break;

		}
}
	}
}

