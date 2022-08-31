package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class computer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] prices = { { 230.21, 400.21, 294.2, 693.33, 340.44, 691.99 },
				{ 529.483, 920.483, 676.66, 1594.659, 783.012, 1591.577 },
				{ 552.504, 960.504, 706.08, 1663.992, 817.056, 1660.776 },
				{ 690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97 } };

		String[] core = { "i3", "i4", "i5", "i6" };
		String[] name = { "lenovo", "hp", "samsung", "acer", "dell", "asus" };
//		__________________Table__________________
		System.out.print("\t" + "\t");
		for (int c = 0; c < 6; c++) {
			System.out.print(name[c] + "\t" + "\t");
		}
		System.out.println();
		for (int r = 0; r < 4; r++) {
			System.out.print("core " + core[r] + "\t" + "\t");
			for (int c = 0; c < 6; c++) {

				if (r == 1 || r == 2) {
					if (c == 3) {
						System.out.print(prices[r][c] + "\t");
					} else {
						System.out.print(prices[r][c] + "\t" + "\t");
					}
				} else {
					System.out.print(prices[r][c] + "\t" + "\t");
				}
			}
			System.out.println();
		}
//	__________________Datainput__________________
		var status = false;
		int tf = 1;
		while (!status) {
			System.out.println("Enter computer brand name:");
			String computer = sc.next();
			for (int c = 0; c < 6; c++) {

				if (name[c].equals(computer)) {
					while (!status) {
						System.out.println("Enter core cpu type:");
						String cpu = sc.next();
						for (int r = 0; r < 4; r++) {
							if (core[r].equals(cpu) || cpu.equals("core" + core[r])) {

								System.out.println("Enter Myanmar kyats per dollar:");
								int currency = sc.nextInt();
								var total = prices[r][c] * currency;
								System.out.println("price: " + prices[r][c] + "$");
								System.out.println("price(in MMK): " + total + "MMK");
								status = true;
								tf = 1;

								break;

							} else {
								tf = 0;
							}

						}
						if (tf == 0) {
							System.out.println("No result found,try again!");
						}
					}
					break;
				} else {
					tf = 0;
				}
			}

			if (tf == 0) {
				System.out.println("No result found,try again!");
			}

		}
	}
}
