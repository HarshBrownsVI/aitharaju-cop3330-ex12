
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
public class Ex12
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int p;
        double rate, updrate;
        int yrs;
        System.out.println("Enter the principal: ");
        p = kb.nextInt();
        System.out.println("Enter the rate of interest:");
        rate = kb.nextDouble();
        updrate = rate / 100;
        System.out.println("Enter the number of years: ");
        yrs = kb.nextInt();
        System.out.println("After " + yrs + " years at " + rate + "%, the investment will be worth $ " + (p * (1 + updrate * yrs)) + ".");
    }
}