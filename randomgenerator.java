import java.util.Random;
public class randomgenerator {
public static void main (String []args){
	int[] numbers=new int [5];
	Random rand=new Random();
	int number=rand.nextInt(20-12)+12;
	System.out.println(number);
}

}
