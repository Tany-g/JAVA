public class T03_1
{
    public static void main(String[] args)
    {
        int n=9;
        for(int i=1;i<n+1;i++)
        {
            for (int j=1; j<i+1; j++)
            {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.print("\n");
        }


    }


}
