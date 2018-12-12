package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string= input.nextLine();
        System.out.println("The reverse string from first common method is : "+ reverseString(string));
        System.out.println("The reverse string from second method is : "+ reverseStrings(string));
        System.out.println("The reverse string  from third method is : "+ reverseAllString(string));
        System.out.println("the reverse string  from fourth method is : "+ reverseAllStrings(string));


    }
    public static String reverseString( String s){
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            st+=c;
        }
        return st;
    }

    public static StringBuilder reverseStrings( String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbd= sb.reverse();
        return sbd;

    }

    public static String reverseAllString(String s){
        char[] letters= s.toCharArray();
        String st= "";
        for(int i=letters.length-1;i>=0;i--){
            char c= letters[i];
            st += c;
        }
        return st;
    }
    public static StringBuilder reverseAllStrings(String s){
        StringBuilder reverse= new StringBuilder();
        for(int i= s.length()-1;i>=0;i--){
            reverse=reverse.append(s.charAt(i));

        /* loop with while method
        int index= s.length()-1;
        while(index>=0){
            reverse= reverse.append(s.charAt(index));
            index--;
        }*/

        }
        return reverse;
    }
}
