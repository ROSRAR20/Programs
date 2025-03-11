


public class excepton{
    public static void main(String[] args)
    {   String s=null;
        try{
            
            System.out.println("Result: "+s.length());
        }
        catch(NullPointerException e)
        {
           System.out.println("Error : null pointer");
        }
        finally
        {
            System.out.println("Execution complete");
        }
        
    }
    
}