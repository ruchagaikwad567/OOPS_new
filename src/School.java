
class Stud
{
    String name;
    //Here school is same for every stud in school so we declare school name as static . i.e it wont change with object
    static String schoolName="JMV";

    public static void changeSchoolName()
    {
        //cannot use this keyword inside static method
        schoolName="new public school";
        System.out.println(schoolName);
    }
}
public class School {
    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.name="myNamw";
        System.out.println(s1.schoolName);
        //s1.changeSchoolName();

        Stud s2=new Stud();
        s2.name="me";
        System.out.println(s2.schoolName);
        s2.changeSchoolName();

    }
}
