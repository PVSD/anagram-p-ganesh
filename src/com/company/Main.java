package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner kbreader = new Scanner(System.in);

        System.out.println("Enter your first word.");
        String word1 = kbreader.next();

        System.out.println("Enter your second word.");
        String word2 = kbreader.next();

        if (word1.length() != word2.length()) {
            System.out.println("Sorry, your words are not anagrams.");

        }

        else if (word1.length() == word2.length()) {
            int character;
            for (character = 0; character <= word1.length(); character++) {
                int a = word1.substring(character, character++).length();

            }
        }
    }
}