public class Chapter3_1
{
    public static void main(String[] args)
    {
        int temp;
        int[] vector = {9, 6, 12, 20, 7, 8};
        for (int i=0; i< vector.length; i++)
        {
            for(int j = i+1; j< vector.length;j++)
            {
                if (vector[i]>vector[j])
                {
                    temp =  vector[j];
                    vector[j] = vector[i];
                    vector[i] = temp;
                }
            }
        }
        for (int m:vector)
        {
            System.out.print(m+" ");
        }
    }

}
