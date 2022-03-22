import java.util.Scanner;

public class Merge
{
    public static void main(String[] args)
    {

        //输入数组
        System.out.println("请输入任意长度的A数组并用“ ”隔开:");
        Scanner in=new Scanner(System.in);
        String[] strs;
        strs = in.nextLine().split(" ");

        int A[]=new int[strs.length];
        int temp=0;
        for(int i=0;i<A.length;i++)
        {
            A[i]=Integer.parseInt(strs[i]);
        }

        //测试输入A内容是否正确
        for (int i: A)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("请输入任意长度的B数组并用“ ”隔开");
        strs = in.nextLine().split(" ");
        int B[]=new int[strs.length];
        for(int i=0;i<B.length;i++)
        {
            B[i]=Integer.parseInt(strs[i]);
        }

        //测试输入B内容是否正确
        for (int i: B)
        {
            System.out.print(i+" ");
        }

        //将输入的数组进行排序
        //A排序
        for (int i=0; i< A.length; i++)
        {
            for(int j = i+1; j< A.length;j++)
            {
                if (A[i]>A[j])
                {
                    temp =  A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }

        //B排序
        for (int i=0; i< B.length; i++)
        {
            for(int j = i+1; j< B.length;j++)
            {
                if (B[i]>B[j])
                {
                    temp =  B[j];
                    B[j] = B[i];
                    B[i] = temp;
                }
            }
        }


        //Merge
        //初始化变量
        int a,b;
        a=b=0;

        //生成的新数组储存的位置
        int[] merge = new int[A.length+ B.length];

        //将两个数组合并
        for (int i=0;i< merge.length;i++)
        {
            if( a < A.length && b<B.length)
            {

                if (A[a]<=B[b])
                {
                    temp = A[a];
                    a++;
                }
                else
                {
                    temp = B[b];
                    b++;
                }
            }
            if (a > A.length)
            {
                temp = B[b];
                b++;
            }
            else if(b > B.length)
            {
                temp = A[a];
                a++;
            }
            merge[i] = temp;
        }


        //输出Merge结果
        System.out.println();
        for(int i:merge)
        {
            System.out.print(i+" ");
        }

    }
}
