package org.example;

import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> inputList = List.of(1,2,3,4,-4,3,-20);
//        List<Integer> x = inputList.stream()
//                .filter(n -> n > 0 )
//                .collect(Collectors.toList());
        List<Integer> x  = inputList.stream()
                .map(n -> n > 0 ? n : 0)
                .collect(Collectors.toList());
        System.out.println(x);
        System.out.println(20/(2+0.0));
    }
}