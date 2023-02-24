package javastrings;

import java.util.Scanner;

public class Strings {


    /**
     * printing strings
     */

    public void stringConcat() {
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + " " + world);
        int one = 1;
        int two = 2;
        String hello1 = "Hello";
        System.out.println(1 + 2 + hello1);
        String one1 = "1";
        int two2 = 2;
        String hello2 = "Hello";
        System.out.println(one1 + two2 + hello2);
        String hello3 = "Hello";
        int one2 = 1;
        int two3 = 2;
        String world1 = "World";
        System.out.println(hello3 + one2 + two3 + world1);

    }

    /**
     * printing strings with StingBuilder
     */

    public void stringBuilderConcat() {
        StringBuilder hello = new StringBuilder("Hello");
        StringBuilder world = new StringBuilder("World");
        System.out.println(hello.append(world));
        int one = 1;
        int two = 2;
        StringBuilder hello1 = new StringBuilder("Hello");
        System.out.println(hello1.append(one).append(two));
        StringBuilder one1 = new StringBuilder("1");
        int two2 = 2;
        StringBuilder hello2 = new StringBuilder("Hello");
        System.out.println(hello2.append(one1).append(two2));
        StringBuilder hello3 = new StringBuilder("Hello");
        int one2 = 1;
        int two3 = 2;
        StringBuilder world1 = new StringBuilder("World");
        System.out.println(hello3.append(one2).append(two3).append(world1));

    }

    /**
     * printing strings with literals
     */

    public void stringLetrals() {
        System.out.println("Enter your string");
        String sc = new Scanner(System.in).nextLine();
        System.out.println(sc.replace(' ', '\n'));
    }


    /**
     * reversing the string
     */

    public void reverseString() {
        System.out.println("Enter your string");
        String str = "";
        char ch;
        String sc = new Scanner(System.in).next();
        for (int i = sc.length() - 1; i >= 0; i--) {
            ch = sc.charAt(i);
            str += ch;
        }
        System.out.println(str);
    }

    /**
     * counting specific ford from string
     *
     * @param line
     * @param token
     * @return
     */

    public int countingToken(String line, String token) {
        int count = 0;
        String[] words = line.split(" ");
        for (String i : words) {
            if (i.equals(token)) {
                count++;
            }
        }
        return count;
    }

    /**
     * making strings to UpperCase
     */

    public void makeUpper() {
        String lower = "Hello World";
        System.out.println(lower.toUpperCase());
        StringBuilder lowers = new StringBuilder("Hello World");
        String uppers = lowers.toString().toUpperCase();
        System.out.println(uppers);
    }

    /**
     * replacing spaces to *
     */

    public void replaceSpaces() {
        System.out.println("Enter a string");
        String text = new Scanner(System.in).next();
        int lenOfStar = 20 - text.length();


        if (text.length() >= 20) {
            for (int i = 0; i < 20; i++) {
                System.out.print(text.charAt(i));
            }
        }
        if (text.length() < 20) {
            for (int i = 0; i < lenOfStar; i++) {
                text += "*";
            }
        }
        System.out.println(text);
    }

    /**
     * removing specific letter from text
     *
     * @param text
     * @return
     */

    public String deletingA(String text) {
        return text.replaceAll("a", "");
    }

    public StringBuilder replacingA(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                text.deleteCharAt(text.charAt(i));
            }
        }
        return text;
    }

    /**
     * finding longest word in string
     *
     * @param text
     * @return
     */

    public String findLongesWord(String text) {
        String longest = "";
        String[] words = text.split("");
        for (String i : words) {
            if (i.length() > longest.length()) {
                longest = i;
            }
        }
        return longest;
    }


    /**
     * finding specific letter from text
     *
     * @param text
     * @param letter
     * @return
     */

    public int findIndex(String text, char letter) {
        int index = text.indexOf(letter);
        return index;
    }

    public int findIndexStringBuilder(StringBuilder text, char letter) {
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                index = i;
            }
        }
        return index;
    }


    /**
     * cheching if String is empty
     *
     * @param text
     * @return
     */

    public boolean checkString(String text) {

        return text.isEmpty() && text.isBlank();
    }

    /**
     * returning longest words
     *
     * @param text
     * @return
     */

    public String findLongestWord(String text) {
        String[] newtext = text.split(",");
        String longest = "";
        for (String i : newtext) {
            if (i.length() > longest.length()) {
                longest = i;
            }
        }
        return longest;
    }

}
