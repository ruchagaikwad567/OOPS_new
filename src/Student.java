public class Student {
    String name;
    int age;

    //constructor overloading
    //polymorphism
    //number or datatype of arguments should be different
    //compile time polymorphism
    public void printInfo()
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }
    public void printInfo(String name)
    {
        System.out.println(this.name);
    }

    public void printInfo(int age)
    {
        System.out.println(this.age);
    }

    public void printInfo(String name,int age)
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student()//non parameterized constructor
    {
        System.out.println("constructor called");
    }

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    Student(Student s1)//copy constructor
    {
        this.name=s1.name;
        this.age=s1.age;
    }
}
