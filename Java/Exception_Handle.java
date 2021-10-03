
public class Main {
    static int a;
    static void show()
    {
        try {
            System.out.println(1/a);
          //here divide by zero exception is handled by try and catch block
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());//prints the error message
        }
    }
    public static void main(String[] args)
    {
        show();
    }
}
