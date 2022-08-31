package assignments;
import java.util.Scanner;


public class sleepHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exit;
		int bedTime;
		int getUp;
		var sH = 0;
		var status=false;
		do{ 
			while(status==false) {
				System.out.println("\nWhen do you go to bed?(in standard time)");
				bedTime=sc.nextInt();
				
				System.out.println("When do you get up?");
				getUp=sc.nextInt();
				if(bedTime<0) {
					System.out.print("Are you out of your mind?There is no country that show hour in negative\nI will ask you again,");
				}
				else if(bedTime==24) {
					System.out.print("\nThere is only up to 23hr in standard time(You can use 0 as 12Am).\nTry again\n");
				}
				else if(bedTime>24){
					System.out.println("\nAre you in drug?\nWhich planet are you from?\nI will ask you one more time,");
				}
						
				else if(bedTime<18 && bedTime>5) {
					
					System.out.println("\nI am not asking about your daytime sleep\nSo tell me");	
					
				}
				else if(getUp>23 || getUp<0) {
					System.out.println("I am not joking,be serious");
				}
				else if(bedTime==getUp) {
					System.out.println("Wow you don't sleep at all?Huh,nice joke");
				}
				
				else {
					if(bedTime>=18) {
						sH=(24-bedTime)+getUp;
					}
					
					else if((bedTime-12)==getUp) {
						sH=12;
					}
					
					else if(bedTime<=5){
						sH=getUp-bedTime;
						
					}
					
					break;
				}
				
			}

			if(sH<5) {
				System.out.println("You are very hardworking!");
			}
			else if(sH>8) {
				System.out.println("You are abnormal!");
			}
			else {
				System.out.println("You take care your health well!");
			}

			System.out.println("The above process will continue unless you enter 'exit'.");
			exit=sc.next();
			
			
		
		}while (!exit.equals("exit")) ;
		 
	}

}
