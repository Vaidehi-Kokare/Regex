package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capital {
    static Pattern pattern = Pattern.compile("([A-Z]){1,}[0-9a-zA-Z]{7,}$");

    public static void main(String[] args) {
        String password = "Vaidehi23";
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}