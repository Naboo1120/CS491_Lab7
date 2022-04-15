package Lab7;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Quiz {
    public static void main(String[] args)throws IOException {


        //Declare the two number variables 

        int num1, num2, operator, question=0;

        int answer = 0;



        Random generator = new Random();



        //Declare Sentinel value

        boolean quit = false;



        while (quit == false)

        {

            //Generate First Random Number

            num1 = generator.nextInt(100);

            //Generate Second random Number

            num2 = generator.nextInt(100);

            //Generate the math Operator

            operator = generator.nextInt(4);

            //Switch replaces the IF statements 

            switch (operator)

            {

                case 0: System.out.print(num1+"+"+num2+"= ");

                    question = num1 + num2;

                    break;

                case 1: System.out.print(num1+"-"+num2+"= ");

                    question = num1 - num2;

                    break;

                case 2: System.out.print(num1+"*"+num2+"= ");

                    question = num1 * num2;

                    break;

                case 3: System.out.print(num1+"/"+num2+"= ");

                    question = num1 / num2;

                    break;

                default:System.err.println("Application Error");

                    System.exit(-1);

                    break;

            }



            answer = Integer.parseInt(.readLine());



            //Check which value is received, Sentinel, correct or incorrect

            if (answer == -99)

            {

                System.out.print("Exit Program: Good Bye!\n");

                quit = true;

            }else if (answer == question)

            {

                System.out.print("Correct Answer!\n");



            }else

                System.out.print("Incorrect Answer\n");



        }//while loop

    }//main

}//class