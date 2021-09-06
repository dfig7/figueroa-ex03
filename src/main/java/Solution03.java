/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

/*
Print: What is the quote?
Save input into String variable quote
Print: Who said it?
Save input into String variable who
Print: 'who' says, \"'quote'\"
 */
public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the quote? ");
        String quote = sc.nextLine();
        System.out.printf("Who said it? ");
        String who = sc.nextLine();
        System.out.println(who + " says, \"" + quote + "\"");
    }
}
