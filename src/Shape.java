public class Shape {//base class or parent class
    public void area()
    {
        System.out.println("displays area");
    }
    class x extends Shape//we can inherit same base class
    {
        
    }

    
}

class triangle extends Shape
{
    public void area()
    {
        System.out.println("1/2*base*height");
    }
    
    
}

class EquilateralTriangle extends Shape
{
    public void area()
    {
        System.out.println("1/2*l*h");
    }
}

class Triangle extends Shape//sub class or child class
{

}
