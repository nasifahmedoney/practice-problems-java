public class functions
{
    public static void main(String[] args)
    {
        String newString = returnString();
        System.out.println("...............");
        System.out.println("printing return String " + returnString() );
    }

    public static String returnString()
    {
        System.out.println("from function");
        return "String";
    }
}