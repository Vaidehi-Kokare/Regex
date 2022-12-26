package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNo {
    static Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String phone = "9190029250702";
       

        if (matcher.matches()) { 
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}
