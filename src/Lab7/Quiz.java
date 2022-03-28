package Lab7;


import java.util.Random;

public class Quiz {

    public static String calc() //accepts values passed to it from randy method
    {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int m = rand1.nextInt(10)+1;
        int n = rand1.nextInt(10)+1;
        int c = rand2.nextInt(3);

        double answer = 0; //declares answer variable

        if (c == 0) //conditional checking if third random number generated is 0
        {
            answer = m + n; //answer to upcoming problem
            String addQ = "What is " + m + " + " + n + ": ";
            return(addQ);
        }

        if (c == 1) //conditional if random number is 1
        {
            answer = m - n; //answer is stored in memory
            String subQ = "What is " + m + " - " + n + ": "; //gives subtraction problem
            return(subQ);
        }

        if (c == 2) //if random number is 2
        {
            answer = m * n; //answer stored in memory
            String multiQ = "What is " + m + " x " + n + ": "; //multiplication problem
            return(multiQ);
        }
        else
            return null;
    }

}
