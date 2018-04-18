import java.util.Scanner;
public class Multiplication {
public static void main (String [] args){
	int [] sum= new int [3];
	Scanner scan=new Scanner(System.in);
	sum[0]= scan.nextInt();
	sum[1]=scan.nextInt();
	sum[2]=scan.nextInt();
	for (int i =0; i<sum.length;i++){
		System.out.println(sum [i]*5);
		
	}
}
}
