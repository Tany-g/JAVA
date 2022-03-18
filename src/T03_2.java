public class T03_2
{

    public static void main(String[] args)
    {
        int n=10;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int x=0; x<i*2+1; x++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


}
