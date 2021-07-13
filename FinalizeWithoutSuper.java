import java.lang.*;
public class FinalizeWithoutSuper {
  
    protected void finalize() throws Throwable
    {
        try {
  
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {
  
            throw e;
        }
        finally {
  
            System.out.println("Calling finalize method"
                               + " of the Object class");
  
            // Calling finalize() of Object class
           
        }
    }
  
    // Driver code
    public static void main(String[] args) throws Throwable
    {
  
        // Creating demo's object
    	FinalizeWithoutSuper d = new FinalizeWithoutSuper();
  
        // Calling finalize of demo
        d.finalize();
    }
}
