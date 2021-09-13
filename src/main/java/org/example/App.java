/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        System.out.print("What is the quote? ");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.print("Who said it? ");
        String str2=sc.nextLine();
        System.out.printf("%s says, \"%s\"",str2,str1);
    }
}
