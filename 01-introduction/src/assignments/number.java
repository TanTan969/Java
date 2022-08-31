package assignments;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you want to type: ");
		int num = sc.nextInt();
		int number;
		int n = 0;
		int p = 0;
		int z = 0;
		int i = 0;
		while (i < num) {
			System.out.print("Enter any number: ");
			number = sc.nextInt();
			if (number > 0) {
				p++;
			} else if (number == 0) {
				z++;
			} else {
				n++;
			}

			i++;
		}
		System.out.println("\nNumbers of zero:"+z );
		System.out.println("\nNumbers of positive number: "+p);
		System.out.println("\nNumbers of negative number: "+n);
	}

}
