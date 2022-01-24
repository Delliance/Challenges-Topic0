package com.danieltesting.Challenges;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner newScanner = new Scanner(System.in);

        System.out.println("""
                Please enter the command and the process/value.

                Available commands: Create (c), Delete (d), Print (p).

                Available Create processes: Application (a), System (s)

                For Delete, please enter the ID of the process you want to delete

                Type exit to finish.""");

        while (true){

            String input = newScanner.nextLine();

            if (input.equalsIgnoreCase("exit")){
                break;
            }
            else{

                try {
                    Console.printOnConsole(input);
                }
                catch (Exception ohNo){
                    System.out.println("Wrong command, please try again");
                }

            }

        }


    }
}
