package com.reg;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[4]{1}[0]{3}[8]{2}","400088"));

        System.out.println(Pattern.matches("^[A]{1}[4]{1}[0]{3}[8]{2}","A400088"));

        System.out.println(Pattern.matches("^[A]{1}[4]{1}[0]{3}[8]{2}[B]","A400088B"));

        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{3,}","Nitin"));

        System.out.println(Pattern.matches("[A-Za-z0-9.]{1,}+@{1}[a-zA-Z]{1,}+.[c]{1}[o]{1}[m]{1}","Nitin.abc@gmail.com"));

        System.out.println(Pattern.matches("[9][1][ ]{1}[0-9]{10}","91 9462917624"));

        System.out.println(Pattern.matches("[A-Z a-z]{8,}","Nitinchv"));
    }
}
