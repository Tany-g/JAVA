public class StudentAnswer
{
    public static void main(String[] args)
    {
        int [][] ST_ANSWER={{'A','B','A','C','C','D','E','E','A','D'},
                            {'D','B','A','B','C','A','E','E','A','D'},
                            {'E','D','D','A','C','B','E','E','A','D'},
                            {'C','B','A','E','D','C','E','E','A','D'},
                            {'A','B','D','C','C','D','E','E','A','D'},
                            {'B','B','E','C','C','D','E','E','A','D'},
                            {'B','B','A','C','C','D','E','E','A','D'},
                            {'E','B','E','C','C','D','E','E','A','D'}};

        int [] answer =     {'D','B','D','C','C','D','A','E','A','D'};
        int [] scores = new int[8];
        int score = 0;
        int index = 0;

        for(int[] st:ST_ANSWER)
        {
            score = 0;
            for(int i = 0;i<st.length;i++)
            {
                if(st[i] == answer[i])
                {
                    score += 10;
                }
            }
            scores[index] = score;
            index++;
        }


        System.out.println("学生的总成绩分别为:");
        for(int grade:scores)
        {
            System.out.print(grade+" ");
        }

    }
}
