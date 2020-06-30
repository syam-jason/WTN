package wtn_inheritance;

public class TestEmployee {
	public static void main(String[] args) 
	{
		Person p=new Person("Abhi");
		Employee e=new Employee("Abhi",12500,2000,"noneed");
		System.out.println(p);
		System.out.println(e);
	}

}