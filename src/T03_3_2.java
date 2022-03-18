public class T03_3_2
{
    public static void main(String[] args)
    {
        int d = 30;
        int r=d/2;


        for(int i=0; i<d; i++)
        {

            int wide=(int)(2*Math.sqrt(Math.pow(r,2)-Math.pow(r-i,2)));
            for(int j=0; j<(d-wide)/2; j++)
            {
                System.out.print("   ");
            }
            System.out.print("*");
            for(int k=0; k<wide; k++)
            {
                System.out.print("   ");
            }
            System.out.print("*");
            System.out.print("\n");
        }

    }
}
