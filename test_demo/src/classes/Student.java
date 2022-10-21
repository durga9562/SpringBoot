package classes;

public class Student {

	
String name;
int age;
String address;

public Student(String name, int age, String address) {
	this.name = name;
	this.age = age;
	this.address = address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return ("Student name is " + this.getName() + ", age is: " + 
               this.getAge() + " and address is: "+
			      this.getAddress());
}
	
	public static void main(String []args){
		Student john = new Student("john",24,"23 East ,california");
		System.out.println(john.toString());
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	}





	}

