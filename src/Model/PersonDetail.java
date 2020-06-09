package Model;

import java.util.stream.IntStream;
import java.io.Serializable;

public class PersonDetail implements Serializable{
	private static final long serialVersionUID = -5302830493777198637L;

	private int id;

	private String lastname;

	private String firstname;

	private String middlename;

	private int age;

	public PersonDetail() {}

	public PersonDetail(int id, String lastname, String firstname, 
			String middlename, int age) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.middlename = middlename;
		this.age = age;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
