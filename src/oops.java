
class Pen
{
    String color;
    String type;
    public void write()
    {
        System.out.println("Pen writes");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }

}



public class oops {
    public static void main(String[] args) {
        /*Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printColor();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.write();
        pen2.printColor();*/

        Student s1=new Student();//Student() is a constructor
        //constructors are functions but have no return type
        //constructor is called only once when an object is created
        s1.name="rucha";
        s1.age=21;

        Student s2=new Student(s1);
        s2.printInfo();

        //no destructors in java because we have garbage collector




    }
}
