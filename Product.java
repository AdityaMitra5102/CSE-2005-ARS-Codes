import java.util.*;
class Product
{
    String name;
    double price;
    double discount;
    Product(String nm, double p, double d)
    {
        name=nm;
        price=p;
        discount=d;
    }
    
    Product(Product ob)
    {
        this(ob.getName(),ob.getPrice(),ob.getDiscount());
    }
    
    String getName()
    {
        return name;
    }
    
    double getPrice()
    {
        return price;
    }
    
    double getDiscount()
    {
        return discount;
    }
}

class ProductBasket
{
    ArrayList<Product> arr=new ArrayList<Product>();
    
    void addProduct(Product ob)
    {
        arr.add(ob);
    }
    
    void removeProduct(int n)
    {
        arr.remove(n);
    }
    
    double calcBill()
    {
        double bill=0;
        for(int i=0;i<arr.size();i++)
        {
            bill+=arr.get(i).getPrice()-arr.get(i).getDiscount();
        }
        return bill;
    }
    
    public ProductBasket clone()
    {
        ProductBasket ob=new ProductBasket();
        for(int i=0;i<arr.size();i++)
        {
            ob.addProduct(new Product(arr.get(i)));
        }
        return ob;
    }
}

class CloneTest
{
    public static void main(String args[])
    {
        //Creating 5 products of different price, 0 discount
        Product arr[]=new Product[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new Product("Product 1", Math.random()*100, 0);
        }
        
        ProductBasket pb1=new ProductBasket();
        for(int i=0;i<5;i++)
        {
            pb1.addProduct(arr[i]);
        }
        
        System.out.println("Basket 1 bill "+pb1.calcBill());
        //Cloning Basket
        ProductBasket pb2=pb1.clone();
        //Removing objects from Basket 1
        pb1.removeProduct(2);
        pb1.removeProduct(3);
        System.out.println("Basket 1 bill "+pb1.calcBill());
        System.out.println("Basket 2 bill "+pb2.calcBill());
    }
    
}