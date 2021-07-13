public class FinalizeWithoutSuper1 
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
