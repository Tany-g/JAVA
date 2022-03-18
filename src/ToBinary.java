import javax.swing.*;

public class ToBinary
{
    public static void main(String[] args)
    {
        int i=6;
        int a=-2147483648; // 掩码

        while(true)
        {
            if((i & a)==0)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
            a = a >>> 1;
            if (a==0)
            {
                break;
            }
        }

    }

}


