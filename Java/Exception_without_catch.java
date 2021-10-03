
public class Main {
    static int a;
    static void show()
    {
        try {
            System.out.println(1/a);
            System.out.println(1/0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        //finally, block is continued with try without try there's no finally.
        // finally, block will execute whether exception will be thrown or not
        finally {
            System.out.println("your entered into finally block");
        }
    }
    public static void main(String[] args)
    {
        show();
    }
}
