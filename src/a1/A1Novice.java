package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int total_number = scan.nextInt();	
		for (int i=0; i<total_number; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int num_items = scan.nextInt();
			double cost = 0;
			for (int j=0; j<num_items; j++) {
				int quantity = scan.nextInt();
				String item_name = scan.next();
				double price = scan.nextDouble();
				cost += quantity*price;
				
				
			}
			System.out.println(first_name.charAt(0)+ ". " + last_name + ": " + cost);
		}
		
	}
}
