package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email {
    static Pattern pattern = Pattern.compile("abc.[a-z]{3,}@bl.co.[a-z]{2}$");

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}
