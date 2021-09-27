//Question 5

import java.util.*;
class Cuboid
{
    double a;
    double b;
    double c;
    double width;
    double height;
    double depth;
    
    Cuboid(double p, double q, double r, double w, double h, double d)
    {
        a=p;
        b=q;
        c=r;
        width=w;
        height=h;
        depth=d;
    }
    
    Cuboid()
    {
        this(0,0,0,1,1,1);
    }
    
    double volume()
    {
        return width*height*depth;
    }
    
    double surfaceArea()
    {
        return 2*(width*height+height*depth+width*depth);
    }
    
    boolean inside(double a, double b, double c)
    {
        return a>this.a-width/2&&a<this.a+width/2&&b>this.b-height/2&&b<this.b+height/2&&c>this.c-depth/2&&c<this.c+depth/2;
    }
}

class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Cuboid ob1=new Cuboid();
        System.out.println("Enter coordinates of centre and dimensions of cuboid");
        Cuboid ob2=new Cuboid(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Volume of ob1: "+ob1.volume());
        System.out.println("Surface area of ob1: "+ob1.surfaceArea());
        System.out.println("Enter coodinates to check");
        boolean inob1=ob1.inside(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Point is "+(inob1?"Inside":"Outside")+" the cuboid");
        System.out.println("Volume of ob2: "+ob2.volume());
        System.out.println("Surface area of ob2: "+ob2.surfaceArea());
        System.out.println("Enter coodinates to check");
        boolean inob2=ob2.inside(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Point is "+(inob2?"Inside":"Outside")+" the cuboid");
    }
}