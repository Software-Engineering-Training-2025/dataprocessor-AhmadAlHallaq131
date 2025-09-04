package org.example.dataprocessor.operations.analysis;

import java.util.List;

public class MeanAnalyzer implements AnalysisStrategy{

    @Override
    public Double analyze(List<Integer> data) {
        if (data == null || data.size() == 0){
            return Double.NaN;
        }
        Double mean =(double) (data.stream()
                .reduce(0,Integer::sum))/data.size();
        return mean;
    }
}
