//Odds and evens game

import java.util.Scanner;
import java.util.Random;
public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let's play a game called \"Odds and Evens\" ");

        //Get name
        Scanner name_input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name_output = name_input.next();

        //ask user to choose odd or even
        Scanner input_choice = new Scanner(System.in);
        System.out.print("Hi "+ name_output + " which one do you choose? (O)dds or (E)vens? ");
        String output_choice = input_choice.next();

        //winning rules
        if (output_choice.equalsIgnoreCase("o")) {
            System.out.println(name_output+" has picked odds! The computer will be evens");
            Scanner input_num = new Scanner(System.in);
            System.out.print("Please choose any number between 0 and 5 inclusive: ");
            int output_num = input_num.nextInt();

            //generate random numbers [0,5]
            System.out.println("Generating a random number between 0 and 5 inclusive ...");
            Random rand_num = new Random();
            int output_rand = rand_num.nextInt(6); //this generates numbers between 0 and 5
            System.out.println("Computer has generated "+output_rand);

            int sum = output_num + output_rand;
            System.out.println("The sum of the two numbers is: "+ sum);
            if (sum%2 != 0) {
                System.out.println("Congratulations "+ name_output+ "! you won : )");
            }else {
                System.out.println("Unfortunately you didn't win :(");
            }
        } else if (output_choice.equalsIgnoreCase("e")) {
            System.out.println(name_output+" has picked evens! The computer will be odds");
            Scanner input_num = new Scanner(System.in);
            System.out.print("Please choose any number between 0 and 5 inclusive: ");
            int output_num = input_num.nextInt();

            //generate random numbers [0,5]
            System.out.println("Generating a random number between 0 and 5 inclusive ...");
            Random rand_num = new Random();
            int output_rand = rand_num.nextInt(6); //this generates numbers between 0 and 5
            System.out.println("Computer has generated "+output_rand);

            int sum = output_num + output_rand;
            System.out.println("The sum of the two numbers is: "+ sum);
            if (sum%2 == 0) {
                System.out.println("Congratulations "+ name_output+ "! you won : )");
            }else {
                System.out.println("Unfortunately you didn't win :(");
            }
        } else {
            System.out.println("Error: please give only \"O\" or \"E\"");
        }
    }
}
