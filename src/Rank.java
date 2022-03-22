import java.util.Random;

public class Rank
{
    public static void main(String[] args)
    {
        //初始化
        int temp;
        int[] Arr = new int[10];
        Random A = new Random();

        //生成随机序列
        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = A.nextInt(101);
            //System.out.print(Arr[i]+" ");
        }

        //排序
        for (int i=0; i< Arr.length; i++)
        {
            for(int j = i+1; j< Arr.length;j++)
            {
                if (Arr[i]>Arr[j])
                {
                    temp =  Arr[j];
                    Arr[j] = Arr[i];
                    Arr[i] = temp;
                }
            }
        }

        //输出
        for (int i:Arr)
        {
            System.out.print(i+" ");
        }

    }
}
