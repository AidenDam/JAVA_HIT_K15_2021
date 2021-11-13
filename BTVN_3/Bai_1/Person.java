// package bai_1;

public class Person
{
	private String name, gender, hobby;
	private int age;

	public Person() {
		this.name = "none";
		this.gender = "none";
		this.hobby = "none";
		this.age = 0;
	}

	public Person(String name, int age, String gender, String hobby) {
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getHobby() {
		return hobby;
	}
	public int getAge() {
		return age;
	}

	public String toString() {
		return name + " " + age + " " + gender + " " + hobby;
	}
}