import java.util.Scanner;

public class TypeConversion
{
    public static void main(String[] arg)
    {
        byte a = 12;
        int b = 129;
        char c= 'a';
        float f=12.5f;
        while(true)
        {
            Scanner in = new Scanner(System.in);
            try
            {
                b = in.nextInt();
                System.out.println("类型转换");
                System.out.println( b );
                System.out.println((char) b);
                System.out.println((byte) b);
                System.out.println((byte) f);
            }
            finally
            {
                if(in.nextLine()=="exit")
                {
                    break;
                }
            }
        }
    }
}
