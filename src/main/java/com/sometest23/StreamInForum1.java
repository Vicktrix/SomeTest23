package com.sometest23;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamInForum1{

    public static void main(String[] args){
        //якщо цифри 0-9
        int[] one = {4,6,7,4,5,4,7,1, 1, 1, 2, 4, 9};
        IntUnaryOperator mapper = new IntUnaryOperator(){
            boolean[] memory = new boolean[10];
            int j;
            @Override
            public int applyAsInt(int i){
                j = memory[i]? 0 : i;
                memory[i]=true;
                return j;
            };  
        };
        Arrays.stream(one).map(mapper).forEach(System.out::println);
        System.out.println("\n\n===========\n\n");
        //якщо цифри int, вмісто масиву використовуємо мапу
        int[] two = {12, 14, 13, 15, 14, 14, 34, 34, 36, 99, -34, -12, 0, -19999, -12, 13};
        Supplier<IntStream> stream = () -> Arrays.stream(two);
        Map<Integer,Boolean> memory = stream.get().distinct().boxed()
                .collect(Collectors.toMap(Function.identity(),v -> false));
        Function<Map<Integer,Boolean>,IntUnaryOperator> newMapper = 
                m -> i -> m.get(i)? 0 : m.put(i,true)? 0 : i;
        stream.get().map(i -> newMapper.apply(memory).applyAsInt(i)).forEach(System.out::println);
    }
}
