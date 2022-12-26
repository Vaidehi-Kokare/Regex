package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Min8 {
    static Pattern pattern = Pattern.compile("([0-9]*[a-zA-Z]){8,}$");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String password = scanner.next();
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) { 
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}
