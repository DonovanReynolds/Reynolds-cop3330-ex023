package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 23 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String toPrint = logicStatements();

        System.out.println(toPrint);
    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }



    public static String logicStatements()
    {
        String temp;
        if (inputOutput("Is the car silent when you turn the key?").toLowerCase().charAt(0) == 'y')
        {
            if (inputOutput("Are the battery terminals corroded?").toLowerCase().charAt(0) == 'y')
            {
                temp = "Clean the terminals and try starting again.";
            }
            else
            {
                temp = "Replace cables and try again.";
            }
            return temp;
        }
        else
        {
            if (inputOutput("Does the car make a slicking noise?").toLowerCase().charAt(0) == 'y')
            {
                temp = "Replace the battery.";
                return temp;
            }
            else
            {
                if (inputOutput("Does the car crank up but fail to start?").toLowerCase().charAt(0) == 'y')
                {
                    temp = "Check spark plug connections.";
                    return temp;
                }
                else
                {
                    if (inputOutput("Does the engine start and then die?").toLowerCase().charAt(0) == 'y') {
                        if (inputOutput("Does your car have fuel injection?").toLowerCase().charAt(0) == 'y') {
                            temp = "Get it in for service.";
                            return temp;
                        } else {
                            temp = "Check to ensure the choke is opening and closing.";
                            return temp;
                        }
                    } else {
                        temp = "This should not be possible.";
                        return temp;
                    }
                }
            }
        }
    }
}
