package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	String firstName;
	String lastName;
	String year;
	
	
	
	public Person(String firstName, String lastName, String year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}
		

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	@Override
	public int compareTo(Person p) {
		int yearCmp = year.compareTo(p.year);
		
		return (yearCmp != 0 ? yearCmp : firstName.compareTo(p.firstName));
	}
	
	
}

public class HomePerson {

	
	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<Person>();
		
		Person p1 = new Person("Vasya", "Pupkin", "1981 year");
		Person p2 = new Person("Petya", "Pupkin", "1980 year");
		Person p3 = new Person("Katya", "Pupkin", "1983 year");
		Person p4 = new Person("Masha", "Pupkin", "1982 year");
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		
		for(Person p : person){
			System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getYear() + "");
			
		}
		
		Collections.sort(person);
		
		System.out.println("**************");
			
		for(Person p : person){
			System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getYear() + "");
			
		}
		
		

	}

}
