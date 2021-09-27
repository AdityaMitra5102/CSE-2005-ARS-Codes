//Question 2

import java.util.*;
class Racket
{
    private String origin;
    private double price;
    private String color;
    
    Racket(String o, double p, String c)
    {
        origin=o;
        price=p;
        color=c;
    }
    
    String getOrigin()
    {
        return origin;
    }
    
    double getPrice()
    {
        return price;
    }
    
    String getColor()
    {
        return color;
    }
    
    void showRacket()
    {
        System.out.println("Origin Country: "+origin);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
    }
}

class Shopkeeper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Racket arr[]=new Racket[4];
        System.out.println("Enter details of 4 rackets");
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter country of origin");
            String o=sc.next();
            System.out.println("Enter price");
            double p=sc.nextDouble();
            System.out.println("Enter color");
            String c=sc.next();
            arr[i]=new Racket(o,p,c);
        }
        
        System.out.println("\nShowing racket details");
        for(int i=0;i<4;i++)
        {
            arr[i].showRacket();
        }
        
        System.out.println("Finding cheapest");
        Racket cheap=arr[0];
        for(int i=0;i<4;i++)
        {
            if(arr[i].getPrice()<cheap.getPrice())
            {
                cheap=arr[i];
            }
        }
        System.out.println("\nCheapest:");
        cheap.showRacket();
    }
}