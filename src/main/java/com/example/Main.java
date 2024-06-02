package com.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @description: TODO
 * @date: 02 June 2024 $
 * @time: 10:20 PM 27 $
 * @author: Qudratjon Komilov
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = Arrays.stream(array)
                .boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        System.out.println(result);
    }

}