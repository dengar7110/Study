package test;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int birth;
	
	public Person(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirth() {
		return birth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
