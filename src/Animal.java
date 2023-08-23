
abstract class Animals
{
    Animals()
    {
        System.out.println("you are creating animal");
    }//it is senseless to create an abstract constructor bcoz it wont be able to fulfill its purpose of initializing an object
    abstract void walk();
    //after making a method as abstract we need not write its implementation
}

//abstract class can have both abstract and non abstract methods

class Horse extends Animals
{
    Horse()
    {
        System.out.println("created a horse");
    }

    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animals{
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}

//we are not creating any object of abstract class.
//so we make Animals class as abstract
//Abstract means it is a concept which need not be true

public class Animal {
    //abstraction is implemented using abstract keyword or interfaces

    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();

        //we cannot create an object of animals class


        //whenever we are creating an object of derived class, first constructor of base class is called ans then constructor of derived class is called
    }
}


//interface is pure abstraction
