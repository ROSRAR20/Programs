class invalidage extends Exception
{
    invalidage(String message)
    {
        super(message);
    }

    public static void check(int age ) throws invalidage
    {
        
        if(age>=18)
        {
            System.out.println("Valid age ");
        }
        else{
            throw new invalidage("Not eligible");
        }
    }
    public static void main(String[] args)
    {   int age =18;
        try
        {
          check(age);  

        }
        catch(invalidage e)
        {
           
           System.out.println("Error "+e);
        }
    }
}