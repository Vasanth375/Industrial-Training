//demonstrating Divide by zero exception
public class Main {

    void Exception()
    {
        try {
            int a=1/0;  //in this statement program aborts it's execution and go to catch block
            System.out.println("Successfully done operation");
        }
        catch (ArithmeticException a)
                //a is object for arithmetic exception class
            // dividebyzero class is called if exception occurs in try block
        {
            System.out.println(a.getMessage());
        }
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.Exception();
    }
}
