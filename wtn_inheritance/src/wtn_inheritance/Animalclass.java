package wtn_inheritance;

class Animal{
void eat()
{
System.out.println("eating");
}
void sleep()
{
System.out.println("sleeping");
}
}

class Bird extends Animal
{
void fly()
{
System.out.println("flying");
}
} 

public class Animalclass 
{
public static void main(String []args) 
{
Animal a=new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
}
}