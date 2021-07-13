public class FinalizeWithoutSuper2
    { 
		@Override
    protected void finalize() throws Throwable
    {
        try
        {
            //release resources here
        } 
        catch(Throwable t) 
        {
            throw t;
        } 
        finally
        {
            super.finalize();
        }
    }
    }
