
interface Uni
{
    int  exam_date=9;

    abstract void set_exam_paper();

}

interface Government
{
    abstract void governs();
}
class College implements Uni,Government
{
    @Override
    public void governs() {
        System.out.println("college is governed");
    }

    @Override
    public void set_exam_paper() {
        System.out.println("college exam starts on Monday");
    }
    //here access modifier has to be compulsory public. any other access modifier not allowed
}


public class University {
    public static void main(String[] args) {
        College c1=new College();
        c1.governs();
        c1.set_exam_paper();

    }
}

// A class can inherit multiple interfaces. It is called multiple inheritance
