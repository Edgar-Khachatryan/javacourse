package javastrings1;

import java.util.*;

public class Main {




    public static void main(String[] args) {
        Strings str = new Strings();

//        System.out.println(str.returnFirstTwo(first));
        System.out.println(str.countXX("alxxoxxxlo"));
        System.out.println(str.isPalindrome("alla"));
        List<String> myList = new ArrayList<>();
        myList.add("ayu");
        myList.add("alu");
        myList.add("apu");
        myList.add("ananas");
        myList.add("apelsin");
        myList.add("mandarin");
        System.out.println(str.listOfStrings(myList));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println(str.evenOdd(numbers));

        System.out.println(str.findSubPalindrome("ava kkkkk,kkk aca mk"));


    }
}
