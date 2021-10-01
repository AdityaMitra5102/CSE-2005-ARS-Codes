import java.util.*;
class TryToParseDouble
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double d=0;
        System.out.println("Enter number");
        String s=sc.nextLine();
        try
        {
            d=Double.parseDouble(s);
        }
        catch(NumberFormatException excep)
        {
            d=0;
        }
        System.out.println(d);
    }
}