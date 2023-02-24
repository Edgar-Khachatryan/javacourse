package javastrings;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Strings str = new Strings();
//        str.stringConcat();
//        str.stringBuilderConcat();
//        str.stringLetrals();
//        str.reverseString();
        String line = "We are living in an yellow submarine. We don't  have anything";

//        System.out.println(str.countingToken(line,"at"));
//        str.makeUpper();
//        str.replaceSpaces();
//        str.replaceSpaces();
//        System.out.println(str.deletingA(line));
        StringBuilder lines = new StringBuilder("We are living in an yellow submarine");
//        System.out.println(str.replacingA(lines));
//        System.out.println(str.findLongesWord(line));
        char letter = 'a';
//        System.out.println(str.findIndex(line,letter));
//        System.out.println(str.findIndexStringBuilder(lines, letter));
//        str.stringLetrals();


        String texttt = "We, are, living, in an, yellow, submarine, We dont, have anything";
        System.out.println(str.findLongestWord(texttt));


    }
}
