package HW_5;

public class Car {
public String Type;
public int Year;
public int Capacity;


public Car() {}

public Car(String type, int year, int capacity) {
	super();
	Type = type;
	Year = year;
	Capacity = capacity;
}

public String getType() {
	return Type;
}

public void setType(String type) {
	Type = type;
}

public int getYear() {
	return Year;
}

public void setYear(int year) {
	Year = year;
}

public int getCapacity() {
	return Capacity;
}

public void setCapacity(int capacity) {
	Capacity = capacity;
}


	

}
