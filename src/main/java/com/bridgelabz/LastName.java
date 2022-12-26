package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LastName {
    static Pattern pattern = Pattern.compile("[A-Z]{3,}$");

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last name: ");
        String LastName = scanner.next();
        Matcher matcher = pattern.matcher(LastName);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    } 
}
