package org.example.dataprocessor.operations.analysis;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianAnalyzer implements AnalysisStrategy{

    @Override
    public Double analyze(List<Integer> data) {
        if(data == null || data.size() == 0){
            return Double.NaN;
        }
        data = data.stream()
                .sorted()
                .collect(Collectors.toList());
        int length = data.size();
        if((length&1) == 0){
            System.out.println(data);
            return (double) ((data.get(length/2) + data.get((length/2)-1))/2);
        }else {
            return (double) data.get(length/2);
        }



    }
}
