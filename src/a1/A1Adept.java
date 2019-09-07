package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num_items_in_store = scan.nextInt();
		String[] items_in_store = new String[num_items_in_store]; 
		double[] prices_items = new double[num_items_in_store];
		
		double total = 0;
		for (int i=0; i<num_items_in_store; i++) {
			String name_item = scan.next();
			double price = scan.nextDouble();
			items_in_store[i] = name_item;
			prices_items[i] = price;

			
//				6
//				Apple 0.25
//				Banana 0.75
//				Milk 3.15
//				Orange 1.25
//				Salami 2.50
//				Sponge 1.15
//				3 
//				Carrie Brownstein 3 2 Banana 1 Orange 2 Milk
//				Corin Tucker 2 3 Banana 2 Sponge
//				Janet Weiss 1 5 Salami
				
			} // start of customer loop
		int num_customers = scan.nextInt();
		String[] names_ofcustomers = new String[num_customers];
		double[] totalcosts_eachcustomer = new double[num_customers];
		for (int j=0; j<num_customers; j++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int items_bought =scan.nextInt();
			double cost = 0;
			names_ofcustomers[j] = first_name + " " + last_name;
			
			// start of item loop 
			for (int k=0; k<items_bought; k++) {
				int quantity = scan.nextInt();
				String item_names = scan.next();
				for (int l=0; l<items_in_store.length; l++) {
					if (items_in_store[l].equals(item_names)) {
						cost += quantity*prices_items[l];
						
						System.out.println(prices_items[l]);
					}
				}

				
			} // end of item 
			
			// cost equals total cost of one customer
			total = cost;
			
				totalcosts_eachcustomer[j] = cost;
			
			
			
		} // end of customer
		//start new customer now
		double biggest = 0.0;
		double smallest = totalcosts_eachcustomer[0];
		for (int n=0; n<num_customers; n++) {
			if (totalcosts_eachcustomer[n]>biggest) {
				biggest = totalcosts_eachcustomer[n];
			}
		} for (int o=0; o<num_customers; o++) {
			if (totalcosts_eachcustomer[o]<smallest) {
				smallest = totalcosts_eachcustomer[o];
	
			}
		} 
		String biggestperson = "";
		String smallestperson = "";

		for (int p=0; p<totalcosts_eachcustomer.length; p++) {
			if (totalcosts_eachcustomer[p] == biggest) {
				biggestperson = names_ofcustomers[p];
			}
			if (totalcosts_eachcustomer[p] == smallest) {
				smallestperson = names_ofcustomers[p];
			}
		}
		double average = 0.0;
		for (int q=0; q<totalcosts_eachcustomer.length; q++) {
			average += totalcosts_eachcustomer[q]; 
			
		}
		System.out.println("Average: " + String.format("%.2f",average/num_customers));
		System.out.println("Biggest: " + biggestperson + " (" + biggest + ")");
		System.out.println("Smallest: " + smallestperson + " (" + smallest + ")");
	// end of logic
	
		
	}
}
