public class T03_3
{
    public static void main(String[] args)
    {
        int D=56;
        int R;
        for(int i=0; i<D ;i++)
        {
            int blankSpace = 0;
            int blankSpace1 = 0;
            int CORRECTPARAMETERS=1;
            double CORRECTPARAMETERS2=1;
            D*=CORRECTPARAMETERS;
            i*=CORRECTPARAMETERS2;
            R=D/2;
            blankSpace=(int)(2*Math.sqrt(Math.pow(R,2)-Math.pow(R-i,2)));
            blankSpace1=((D-blankSpace)/2);
            for (int j=0; j<blankSpace1; j++)
            {
                System.out.print("   ");//打印空格
            }
            System.out.print("*");//打印星号

            for (int k=0; k<blankSpace; k++)
            {
                System.out.print("***");//打印空格
            }
            System.out.print("*");//打印星号
            System.out.print("\n");
        }


        System.out.println(Math.PI);
    }
}
