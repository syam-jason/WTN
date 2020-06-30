package wtn_polymorphism;

class Fruit
{
String name1,taste1;
int size1;
Fruit(String name,String taste ,int size )
{
	name1=name;
	taste1=taste;
	size1=size;
}

}
class Apple extends Fruit
{
	Apple(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}

	void eat()
	{
		System.out.println("fruitname="+name1    +"     fruittaste="+taste1);
	}	
}
class Orange extends Fruit
{

	Orange(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}
	void eat()
	{
		System.out.println("fruitname="+name1    +"     fruittaste="+taste1);
	}
	
}
public class Fruits {
	public static void main(String[] args) {
		Apple a=new Apple("apple","sweet",10);
		a.eat();
		Orange o=new Orange("Orange","sweet",20);
		o.eat();
	}

}