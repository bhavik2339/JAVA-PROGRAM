class Person 
{
	String name;
	int age;
}
public class dot
{
	public static void main(String[] args) 
	{
	Person person = new Person();
	person.name = "bhavik";
	person.age =18;
	System.out.println("Name: " + person.name);
	System.out.println("Age: " + person.age);
	}
}