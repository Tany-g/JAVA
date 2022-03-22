import java.util.Scanner;

public class T03_3_2
{
    public static void main(String[] args)
    {
        System.out.println("请输入圆的直径：");
        Scanner in = new Scanner(System.in);
        int d = 2*in.nextInt()+1;
        int r=d/2;
        for(int i=0; i<d; i++)
        {
            int l = (int)Math.round(Math.sqrt(Math.pow(r,2)-Math.pow(r-i,2)));
            float fractionalPpart = (float)Math.sqrt(Math.pow(r,2)-Math.pow(r-i,2))%1;
            int kong = r - l;
            int wide=2*l;

            for(int j=0; j<kong; j++)
            {
                System.out.print("   ");
            }
            if(fractionalPpart>=0.8||fractionalPpart<=0.2)
            {
                System.out.print("*");
            }
            for(int k=0; k<wide; k++)
            {
                System.out.print("   ");
            }
            if(fractionalPpart>=0.8||fractionalPpart<=0.2)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
