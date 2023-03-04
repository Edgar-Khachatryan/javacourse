package javastrings1;

import java.util.ArrayList;
import java.util.List;

public class Strings {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /**
     * @param first
     * @return returning first two characters from the string
     */

    public String returnFirstTwo(String first) {

        String second = "";
        for (int i = 0; i < 2; i++) {
            second += first.charAt(i);
        }
        return second;
    }

    /**
     * @param str
     * @return count of "xx"
     */

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param str
     * @return checking if string if palindrome
     */

    public boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            return true;
        }
        return false;
    }


    /**
     * @param myList
     * @return returning strings start with a
     */
    public List listOfStrings(List<String> myList) {
        List<String> yourList = new ArrayList<>();
        for (String i : myList) {
            if (i.startsWith("a") && i.length() == 3) {
                yourList.add(i);
            }
        }
        return yourList;
    }

    public String evenOdd(List<Integer> listOfStrings) {
        String even = "";
        for (int num : listOfStrings) {
            if (num % 2 == 0) {
                even += "e" + num;
            } else even += "o" + num;
        }
        return even;
    }

    /**
     * creating cezar alphabet
     * @param text
     * @param key
     * @return
     */

    public String cezarAlphabet(String text, int key){
        String chars = "";
        for (int i = 0; i < text.length(); i++) {
            chars +=ALPHABET.charAt(i+key);
        }
        return chars;
    };

    /**
     * finding sub palindrome
     * @param text
     * @return
     */

    public String findSubPalindrome(String text) {

        ArrayList<String> subs = new ArrayList<>();
        for (int i = 0; i < text.length() - 1; i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (isPalindrome(text.substring(i, j))) {
                    subs.add(text.substring(i, j));
                }
            }
            System.out.println("afnafnnfnsdnsfk");

        }
        int index = 0;
        int longestSubs = 0;
        for (int i = 0; i < subs.size(); i++) {
            if (subs.get(i).length() > longestSubs) {
                longestSubs = subs.get(i).length();
                index = i;
            }
        }
        return subs.get(index);

    }


}
