/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachersapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    Scanner sc = new Scanner(System.in);
    
    int userChoice;

    public int integers(String question) {
        System.out.println(question);
        int x = sc.nextInt();
        return x;
    }


    public void takeIntInput() {
        userChoice = sc.nextInt();
        
    }

    public int minMaxInt(String question) {
        int x = 0;
        int min = 0;
        int max = 0;
        while (x < max && x > min) {
            System.out.println(question);
            x = sc.nextInt();
            min = sc.nextInt();
            max = sc.nextInt();
        }
        return x;
    }

    public double strings(String question) {
        System.out.println(question);
        double x = sc.nextInt();
        return x;
    }

    public float floats(String question) {
        System.out.println(question);
        float x = sc.nextFloat();
        return x;
    }

    public float minMaxFloat(String question) {
        float x = 0;
        float min = 0;
        float max = 0;
        while (x < max && x > min) {
            System.out.println(question);
            x = sc.nextFloat();
            min = sc.nextFloat();
            max = sc.nextFloat();
        }
        return x;
    }

    public double doubles(String question) {
        System.out.println(question);
        double x = sc.nextDouble();
        return x;
    }

    public double minMaxDouble(String question) {
        double x = 0;
        double min = 0;
        double max = 0;
        while (x < max && x > min) {
            System.out.println(question);
            x = sc.nextDouble();
            min = sc.nextDouble();
            max = sc.nextDouble();
        }
        return x;
    }

    public void Stringprinter(String prompt) {
        System.out.print(prompt);
    }
    
        public void openingPrompt() {
        System.out.println("Welcome. What would you like to do, pick 1-6?");
        System.out.println("1) View Student List.");
        System.out.println("2) Add a Student to the List.");
        System.out.println("3) Remove a Student from the List.");
        System.out.println("4) List quiz grades for a Student.");
        System.out.println("5) Average quiz scores for a Student.");
        System.out.println("6) Quit Program");
    }
    
    public void endingPrompt(){
        System.out.println("Thanks for using TeachersApp. Have a good day!");
    }
    
    public void print(String msg) {
        System.out.println(msg);
    }

    public String readString(String prompt) {
        Scanner mySc = new Scanner(System.in);
        System.out.println(prompt);
        return mySc.nextLine();
    }
    
    public int readInt(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextInt();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);
        return result;
    }

    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = readInt(prompt);
        } while (result < min || result > max);

        return result;
    }

    public long readLong(String prompt) {
        boolean badInput;
        long result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextLong();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }

    public float readFloat(String prompt) {
        boolean badInput;
        float result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextFloat();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = readFloat(prompt);
        } while (result < min || result > max);

        return result;
    }

    public double readDouble(String prompt) {
        boolean badInput;
        double result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextDouble();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public double readDouble(String prompt, double min, double max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }

}
