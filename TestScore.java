import java.util.*;
class TestScore
{
    static void assignScore(int score, int arr[], int pos) throws ScoreException
    {
        if(score<0||score>100) throw new ScoreException();
        arr[pos]=score;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int idArr[]={1,2,3,4,5};
        int scoreArr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter score for id "+idArr[i]);
            int scr=sc.nextInt();
            try
            {
                assignScore(scr,scoreArr,i);
            }
            catch(ScoreException excep)
            {
                System.err.println(excep.getMessage());
                System.err.println("ID "+idArr[i]);
                scoreArr[i]=0;
            }
        }
        System.out.println("Showing");
        for(int i=0;i<5;i++)
        {
            System.out.println("Score for id "+idArr[i]);
            System.out.println(scoreArr[i]);
        }
    }
}