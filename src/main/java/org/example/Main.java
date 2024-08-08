package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static Boolean checkForPalindrome(String word) {
        String reversed = "";
        String cleanedWord = word.toLowerCase(Locale.ENGLISH).replaceAll("[\\s.,!?\"']", "");
        for (int i = cleanedWord.length() - 1; i >= 0; i--) {
            reversed += cleanedWord.charAt(i);
        }
        return cleanedWord.equals(reversed);
    }


    public static String convertDecimalToBinary(int decimal) {
        LinkedList<Integer> numbers = new LinkedList<>();
        while (decimal != 0) {
            numbers.addFirst(decimal % 2);
            decimal /= 2;

        }
        StringBuilder result = new StringBuilder();
        for (Integer i : numbers) {
            result.append(i);
        }
        return result.toString();
    }



}