public class Chapter3_2
{
    public static void main(String[] args)
    {
        int sum=0;
        int[ ] vectorX = {9, 6, 12, 20, 7, 8};
        int[ ] vectorY = {5, 6, 7, 8, 7, 8};
        for (int i=0;i< vectorX.length;i++)
        {
            sum+=vectorX[i]*vectorY[i];
        }
        System.out.println(sum);
    }
}
