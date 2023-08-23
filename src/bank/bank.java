package bank;


class Account
{
    String name;//default accessible to any class in same package only
    protected String email;//protected accessible to any class in same package but only subclass in different package
    private String password;//private accessible only in same class


    //to access private methods and variables we use getters and setters.
    // The getter method returns the value of the attribute.
    // The setter method takes a parameter and assigns it to the attribute.
    // Getters and setters allow control over the values.
    // You may validate the given value in the setter before actually setting the value.

    public String getPassword()//getter
    {
        return this.password;
    }

    public void setPassword(String s)
{
    this.password=s;
}
}
public class bank {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Apna college";
        a1.name="ruh";
        a1.email="ruch123@gmail.com";

    }
}

//encapsulation
//we implement concept of data hiding using access modifiers
