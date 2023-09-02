package com.sometest23;

import java.util.HashMap;
import java.util.Map;

public class PrintBigText{
    static Map<String, String[]> symbol = MySymbol.map;
    public static void main(String[] args){
        System.out.println("Some test");
        String[] A = symbol.get("A");
        String[] B = symbol.get("B");
        String[] H = symbol.get("H");
        String[] V = symbol.get("V");
        String[] O = symbol.get("O");
        String[] I = symbol.get("I");
        String[] T = symbol.get("T");
        String[] R = symbol.get("R");
        String[] K = symbol.get("K");
        String[] J = symbol.get("J");
        System.out.println("alphabet size = "+symbol.size());
        System.out.println("Some test for single symbol");
        print(A);
        print(B);
        System.out.println("Some test for word symbol");
        print(A, B, B, A);
        print(A, H, O, J);
        print(V, I, K, T, O, R);
        System.out.println("My map is : ");
        print(symbol.values().toArray(String[][]::new));
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
        static Map<String, String[]> map = new HashMap<>();
        static {
        String A = """
    
      +   \s
     + +  \s
    +++++ \s
    +   + \s
    +   + \s""";
        String B = """
    
    ++++  \s
    +   + \s
    ++++  \s
    +   + \s
    +++++ \s""";
        String C = """
                   
     +++  \s
    +   + \s
    +     \s
    +   + \s
     +++  \s""";
        String D = """
                   
    ++++  \s
    +  ++ \s
    +   + \s
    +   + \s
    ++++  \s""";
        String E = """
                   
    +++++ \s
    +     \s
    ++++  \s
    +     \s
    +++++ \s""";
        String F = """
                   
    +++++ \s
    +     \s
    ++++  \s
    +     \s
    +     \s""";        
        String G = """
                   
     ++++ \s
    +     \s
    +  ++ \s
    +   + \s
     ++++ \s""";        
        String H = """
                   
    +   + \s
    +   + \s
    +++++ \s
    +   + \s
    +   + \s""";        
        String I = """
                   
    +++ \s
     +  \s
     +  \s
     +  \s
    +++ \s""";        
        String J = """
                   
      ++ \s
       + \s
       + \s
    +  + \s
     ++  \s""";        
        String K = """
                   
    +  + \s
    + +  \s
    ++   \s
    + +  \s
    +  + \s""";        
        String L = """
                   
    +     \s
    +     \s
    +     \s
    +   + \s
    +++++ \s""";        
        String M = """
                   
    ++   ++ \s
    + + + + \s
    +  +  + \s
    +     + \s
    +     + \s""";     
        String N = """
                   
    +   + \s
    ++  + \s
    + + + \s
    +  ++ \s
    +   + \s""";        
        String O = """
                   
     +++  \s
    +   + \s
    +   + \s
    +   + \s
     +++  \s""";        
        String P = """
                   
    ++++  \s
    +   + \s
    ++++  \s
    +     \s
    +     \s""";        
        String Q = """
                   
     ++++  \s
    +    + \s
    +  + + \s
    +   ++ \s
     +++ + \s""";        
        String R = """
                   
    ++++  \s
    +   + \s
    ++++  \s
    +  +  \s
    +   + \s""";        
        String S = """
                   
     ++++ \s
    +     \s
     +++  \s
        + \s
    ++++  \s""";        
        String T = """
                   
    +++++ \s
      +   \s
      +   \s
      +   \s
      +   \s""";       
        String U = """
                   
    +   + \s
    +   + \s
    +   + \s
    +   + \s
     +++  \s""";        
        String V = """
                   
    +   + \s
    +   + \s
    +   + \s
     + +  \s
      +   \s""";        
        String W = """
                   
    +     + \s
    +  +  + \s
    + ++ +  \s
    ++ ++   \s
    +  +    \s""";        
        String X = """
                   
    +   +  \s
     + +   \s
      +    \s
     + +   \s
    +   +  \s""";        
        String Y = """
                   
    +   + \s
    +   + \s
     + +  \s
      +   \s
      +   \s""";        
        String Z = """
                   
    +++++ \s
       +  \s
      +   \s
     +    \s
    +++++ \s""";        
        map.put("A",A.split("\n"));
        map.put("B",B.split("\n"));
        map.put("C",C.split("\n"));
        map.put("D",D.split("\n"));
        map.put("E",E.split("\n"));
        map.put("F",F.split("\n"));
        map.put("G",G.split("\n"));
        map.put("H",H.split("\n"));
        map.put("I",I.split("\n"));
        map.put("J",J.split("\n"));
        map.put("K",K.split("\n"));
        map.put("L",L.split("\n"));
        map.put("M",M.split("\n"));
        map.put("N",N.split("\n"));
        map.put("O",O.split("\n"));
        map.put("P",P.split("\n"));
        map.put("Q",Q.split("\n"));
        map.put("R",R.split("\n"));
        map.put("S",S.split("\n"));
        map.put("T",T.split("\n"));
        map.put("U",U.split("\n"));
        map.put("V",V.split("\n"));
        map.put("W",W.split("\n"));
        map.put("X",X.split("\n"));
        map.put("Y",Y.split("\n"));
        map.put("Z",Z.split("\n"));
        }
    }
}
