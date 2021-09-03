

public class RunTimesCalculator {

    public void instrCount(int n)
    {
        int instrCounter = 3; //counting variables
        int sum2 = 0;
        for(int i = 1; i <= n; i++, instrCounter++)
            for(int j = 1; j <= n; j++, instrCounter++)
            {
                sum2++;
                instrCounter++;
            }
        System.out.println(instrCounter);

        int instrCounterTwo = 2; //counting variables
        int sum4 = 0;
        for(int i = 1; i <= n; i *= 2, instrCounterTwo++)
        {
            sum4++;
            instrCounterTwo++;
        }
        System.out.println(instrCounterTwo);

    }

}
