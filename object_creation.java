public class Main 
{
    int a,b,c;
    void add()
    {
        c=a+b;
    }
    void show()
    {
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        // creating the object of Main class
        Main obj=new Main();
        // assigning values to instance variables
        obj.a=2;
        obj.b=78;
        // performing addition operation method
        obj.add();
        // displaying the added content
        obj.show();
    }
}
