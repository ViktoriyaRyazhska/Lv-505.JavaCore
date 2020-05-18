package Topic3;

public class main3 {

	public static void main(String[] args) {

		Employee oleg = new Employee();
		oleg.setName("Oleg");
		oleg.setHours(50);
		oleg.setRate(24);
		Employee vasya = new Employee("Vasya", 15, 20);
		Employee olga = new Employee("Olga", 10, 12);

		System.out.println( oleg );
		System.out.println( vasya );
		System.out.println( olga );
	
	}

}
