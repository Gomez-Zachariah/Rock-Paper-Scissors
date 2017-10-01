package acer;
import java.util.Scanner;
import java.util.Random;
public class RocknPaper {
public static void main(String args[]) {
		
int Rock = 0; 
int Paper = 1; 
int Scissors = 2; 
int user; 
int computer; 

Scanner myScan = new Scanner(System.in);
Random myRand = new Random();
System.out.println("0. Rock");
System.out.println("1. Paper");
System.out.println("2. Scissors");
user = myScan.nextInt();
computer = myRand.nextInt(3);

System.out.println("computer = " + computer + " user = " + user);

if ( user==computer )
{
    System.out.println("Tie Game!");
}
else if ( (user==Rock && computer==Scissors) || (user==Scissors && computer==Paper) || (user==Paper && computer== Rock) )
{
    System.out.println("User Wins!");
}
else
{
    System.out.println("Computer WIns!");
		}
	}
}
