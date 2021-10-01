import java.util.*;
class BadSubscriptCaught
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]={"Emma","Olivia","Sophia","Isabella","Ava","Mia","Emily","Abigail"};
        System.out.println("Enter position");
        int pos=sc.nextInt();
        try
        {
            System.out.println(arr[pos]);
        }
        catch(ArrayIndexOutOfBoundsException excep)
        {
            System.err.println("Subscript does not exist");
        }
    }
}