package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AtLeastOneNo {
    static Pattern pattern = Pattern.compile("([0-9]*[A-Z]){1,}[0-9a-zA-Z]{7,}$");

    public static void main(String[] args) {
        String passowrd = "Vaidehi23";
        Matcher matcher = pattern.matcher(passowrd);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");

        }


    }
}
