import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)                                /**计算矩形的周长以及面积  */
    {
        int length,width,arear,perimeter;
        System.out.println("请输入矩形的长宽并用 空格 间隔:");
        Scanner in = new Scanner(System.in);                                     // 输入长宽
        length = in.nextInt();
        width = in.nextInt();
        arear = length*width;
        perimeter = 2*(length+width);
        System.out.println("矩形的面积为："+arear+" 矩形的周长为："+perimeter);   /*输出
                                                                                结果*/
        int b= 011001;
        int x=9,y=11,z=8,t,w;
        t = x>y?x:y+x;
        w = t>z?t:z;
        System.out.println(w);

        int a=10,c=20;
        System.out.println(a=a^b);
        System.out.println(b=b^a);

    }
}
