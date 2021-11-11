package lab4q1;

public class Person extends Account{
	private String name;
	  private float age;
	public Person(long accNum, Double balance, String accHolder, String name, float age) {
		super(accNum, balance, accHolder);
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	  
}
