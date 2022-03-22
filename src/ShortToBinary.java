import java.util.Scanner;

public class ShortToBinary
{
    public static void main(String[] arg)
    {
        System.out.println("请输入一个“short”型整数：");
        Scanner in = new Scanner(System.in);
        short n = in.nextShort();
        int mask = 1<<15;
        while (true)
        {
            if ((mask&n)==0)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
            mask = mask >>> 1;
            if (mask == 0)
            {
                break;
            }
        }
    }
}
