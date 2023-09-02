package com.sometest23;

import java.util.HashMap;
import java.util.Map;

public class PrintBigText{
    static Map<Character, String[]> mySymbol = MySymbol.getMap();
    public static void main(String[] args){
        System.out.println("Some test with new map ");
        String[] A = mySymbol.get('A');
        String[] H = mySymbol.get('H');
        String[] J = mySymbol.get('J');
        String[] B = mySymbol.get('B');
        String[] V = mySymbol.get('V');
        String[] I = mySymbol.get('I');
        String[] K = mySymbol.get('K');
        String[] T = mySymbol.get('T');
        String[] O = mySymbol.get('O');
        String[] R = mySymbol.get('R');
        System.out.println("alphabet size = "+mySymbol.size());
        System.out.println("Some test for single symbol");
        print(A);
        print(B);
        System.out.println("Some test for word symbol");
        print(A, B, B, A);
        print(A, H, O, J);
        print(V, I, K, T, O, R);
        System.out.println("My map is : ");
        print(mySymbol.values().toArray(String[][]::new));
        MySymbol.replaceMap('X');
        System.out.println("alphabet size = "+mySymbol.size());
        print(mySymbol.values().toArray(String[][]::new));
        V = mySymbol.get('V');
        I = mySymbol.get('I');
        K = mySymbol.get('K');
        T = mySymbol.get('T');
        O = mySymbol.get('O');
        R = mySymbol.get('R');
        print(V, I, K, T, O, R);   
        MySymbol.replaceMap('7');
        print(mySymbol.values().toArray(String[][]::new));
        V = mySymbol.get('V');
        I = mySymbol.get('I');
        K = mySymbol.get('K');
        T = mySymbol.get('T');
        O = mySymbol.get('O');
        R = mySymbol.get('R');
        print(V, I, K, T, O, R);
    }
    static void print(String[]... full) {
        for(int j=0; j<6; j++) {
            for(int i=0; i<full.length; i++) 
                System.out.print(full[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    static class MySymbol {
        private static Map<Character, String[]> map = new HashMap<>();
        private static char currentValue = '+';

        public static Map<Character, String[]> getMap() {
            if(map.size() != 26) fillMap();
            return map;
        }
        private static void fillMap() {
            for(int i='A', j=0; i<='Z';i++, j++) 
                map.put(Character.valueOf((char)i),template[j].split("\n"));
        }
        public static void replaceMap(char ch) {
            for(int i=0; i<template.length; i++)
                template[i] = template[i].replace(currentValue,ch);
            currentValue = ch;
            fillMap();
        }
        private static String[] template = {"""
    
      +   \s
     + +  \s
    +++++ \s
    +   + \s
    +   + \s""", """
    
    ++++  \s
    +   + \s
    ++++  \s
    +   + \s
    +++++ \s""","""
                   
     +++  \s
    +   + \s
    +     \s
    +   + \s
     +++  \s""","""
                   
    ++++  \s
    +  ++ \s
    +   + \s
    +   + \s
    ++++  \s""","""
                   
    +++++ \s
    +     \s
    ++++  \s
    +     \s
    +++++ \s""","""
                   
    +++++ \s
    +     \s
    ++++  \s
    +     \s
    +     \s""","""
                   
     ++++ \s
    +     \s
    +  ++ \s
    +   + \s
     ++++ \s""","""
                   
    +   + \s
    +   + \s
    +++++ \s
    +   + \s
    +   + \s""","""
                   
    +++ \s
     +  \s
     +  \s
     +  \s
    +++ \s""","""
                   
      ++ \s
       + \s
       + \s
    +  + \s
     ++  \s""","""
                   
    +  + \s
    + +  \s
    ++   \s
    + +  \s
    +  + \s""","""
                   
    +     \s
    +     \s
    +     \s
    +   + \s
    +++++ \s""","""
                   
    ++   ++ \s
    + + + + \s
    +  +  + \s
    +     + \s
    +     + \s""","""
                   
    +   + \s
    ++  + \s
    + + + \s
    +  ++ \s
    +   + \s""","""
                   
     +++  \s
    +   + \s
    +   + \s
    +   + \s
     +++  \s""","""
                   
    ++++  \s
    +   + \s
    ++++  \s
    +     \s
    +     \s""","""
                   
     ++++  \s
    +    + \s
    +  + + \s
    +   ++ \s
     +++ + \s""","""
                   
    ++++  \s
    +   + \s
    ++++  \s
    +  +  \s
    +   + \s""","""
                   
     ++++ \s
    +     \s
     +++  \s
        + \s
    ++++  \s""","""
                   
    +++++ \s
      +   \s
      +   \s
      +   \s
      +   \s""","""
                   
    +   + \s
    +   + \s
    +   + \s
    +   + \s
     +++  \s""","""
                   
    +   + \s
    +   + \s
    +   + \s
     + +  \s
      +   \s""","""
                   
    +     + \s
    +  +  + \s
    + ++ +  \s
    ++ ++   \s
    +  +    \s""","""
                   
    +   +  \s
     + +   \s
      +    \s
     + +   \s
    +   +  \s""","""
                   
    +   + \s
    +   + \s
     + +  \s
      +   \s
      +   \s""","""
                   
    +++++ \s
       +  \s
      +   \s
     +    \s
    +++++ \s"""            
        };
    }
}
