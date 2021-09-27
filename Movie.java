class Movie
{
    String name;
    String category;
    int rating[];
    
    Movie(String nm, String cat)
    {
        name=nm;
        category=cat;
        rating=new int[5];
    }
    String getName()
    {
        return name;
    }
    
    String getCategory()
    {
        return category;
    }
    
    void addRating(int r)
    {
        try
        {
            rating[--r]++;
        }
        catch(ArrayIndexOutOfBoundsException excep)
        {
            System.err.println("Invalid Rating");
        }
    }
    
    double getAverage()
    {
        double sum=0.0;
        int count=0;
        for(int i=0;i<5;i++)
        {
            sum+=rating[i]*(i+1);
            count+=rating[i];
        }
        return sum/count;
    }
}

class MovieMain
{
    public static void main(String args[])
    {
        Movie m1=new Movie("Test Movie 1","U/A");
        Movie m2=new Movie("Test Movie 2","U");
        
        for(int i=0;i<5;i++)
        {
            int rate=(int)(Math.random()*4+1);
            m1.addRating(rate);
            rate=(int)(Math.random()*4+1);
            m2.addRating(rate);
        }
        System.out.println("Name\tCategory\tAverage Rating");
        System.out.println(m1.getName()+"\t"+m1.getCategory()+"\t"+m1.getAverage());
        System.out.println(m2.getName()+"\t"+m2.getCategory()+"\t"+m2.getAverage());
    }
}