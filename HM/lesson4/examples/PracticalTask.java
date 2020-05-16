package lesson4.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask {

	public enum Continent {
		AFRICA, EUROPE, AMERICA, ASIA
		}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num = 0;
		int count=0;
		int day;
		String country = " ";
		double max=0;
		
		
		//TASK1
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter number");
			num = Integer.parseInt(br.readLine());
			if(num % 2 == 0) {
				count++;
			}
		}
		System.out.println(count+" even numbers are entered");
		
		//TASK2
		System.out.println("\nEnter the day number");
		day = Integer.parseInt(br.readLine());
		switch(day) {
		case 1:
			System.out.println("Monday Понеділок Понедельник");
			break;
		case 2:
			System.out.println("Tuesday Вівторок Вторник");
			break;
		case 3:
			System.out.println("Wednesday Середа Среда");
			break;
		case 4:
			System.out.println("Thursday Четвер Четверг");
			break;
		case 5:
			System.out.println("Friday П'ятниця Пятница");
			break;
		case 6:
			System.out.println("Saturday Субота Суботта");
			break;
		case 7:
			System.out.println("Sunday Неділя Воскресениє");
			break;
		default:
			System.out.println("Unknown day");
		}
		
		//TASK3
		Continent continent = Continent.AFRICA;
		System.out.println("\nChoose a country");
		country = br.readLine();
		switch (country.toLowerCase()) {
		case "nigeria": case "algeria": case "egypt":
			continent = Continent.AFRICA; break;
		case "ukraine": case "germany": case "poland":
			continent = Continent.EUROPE; break;
		case "china": case "thailand": case "japan":
			continent = Continent.ASIA; break;
		case "canada": case "cuba": case "colombia":
			continent = Continent.AMERICA; break;
		default:
			System.out.println("Unknown country");
		}

		System.out.println(continent);
		
		//TASK4
		Product product1 = new Product();
		product1.newProduct("Water", 1, 100);

		Product product2 = new Product();
		product2.newProduct("Cookies", 20, 60);

		Product product3 = new Product();
		product3.newProduct("Bread", 4, 80);
		
		Product product4 = new Product();
		product4.newProduct("Banana", 15, 50);
		
		//Search for the highest price
		max = product1.getPrice();
		if(max<product2.getPrice()){
			max = product2.getPrice();
		} else if(max<product3.getPrice()){
			max = product3.getPrice();
		} else if(max<product4.getPrice()){
			max = product4.getPrice();
		} 
		
		System.out.print("The most expensive product is ");
		if(product1.getPrice()==max) {
			System.out.println(product1.getName()+"  quantity: "+product1.getQuantity());
		} else if(product2.getPrice()==max) {
			System.out.println(product2.getName()+"  quantity: "+product2.getQuantity());
		} else if(product3.getPrice()==max) {
			System.out.println(product3.getName()+"  quantity: "+product3.getQuantity());
		} else {
			System.out.println(product4.getName()+"  quantity: "+product4.getQuantity());
		}
		
		//Search for the biggest quantity
		max = product1.getQuantity();
		if(max<product2.getQuantity()){
			max = product2.getQuantity();
		} else if(max<product3.getQuantity()){
			max = product3.getQuantity();
		} else if(max<product4.getQuantity()){
			max = product4.getQuantity();
		} 
		System.out.print("The biggest quantity has ");
		if(product1.getQuantity()==max) {
			System.out.println(product1.getName());
		} else if(product2.getQuantity()==max) {
			System.out.println(product2.getName());
		} else if(product3.getQuantity()==max) {
			System.out.println(product3.getName());
		} else {
			System.out.println(product4.getName());
		}
		
	}

}
