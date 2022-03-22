public class Chapter3_3
{
    public static void main(String[] args)
    {
        float [][] A= {
                {1.2f, 2.3f, 3.4f},
                {4.5f, 5.6f, 6.7f}};
        float [][] B= {
                {9.8f, 8.7f, 7.6f, 6.5f},
                {8.7f, 7.6f, 6.5f, 5.4f},
                {7.6f, 6.5f, 5.4f, 4.3f}};
        float[][] C =new float[2][4];

        for(int i=0;i < A.length;i++)
        {
            for(int j=0;j < B[0].length;j++)
            {
                float sum = 0;
                for(int k=0;k< A[0].length;k++)
                {
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j]=sum;
            }
        }

        for(int i = 0; i <C.length; i++)
        {
            for (int j=0; j< C[0].length;j++)
            {
                System.out.printf("%6.2f ",C[i][j]);
            }
            System.out.println();
        }
    }
}

