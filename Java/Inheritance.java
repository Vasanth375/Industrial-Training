/* Basic example of Inheritance*/
class ParentClass
{
    float salary=12000;
}
public class Inheritance extends ParentClass  //by using extends keyword we can make inheritance
{       //Inheritance inherits the properties from ParentClass
    public static void main(String[] args) 
    {
        System.out.print("Salary of Jr.Software Developer\n");
        Inheritance Iobj=new Inheritance();
        System.out.println(Iobj.salary);
    }
}
