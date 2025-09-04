package org.example.dataprocessor.operations.analysis;

import java.util.List;
import java.util.stream.Collectors;

public class P90NearestRankAnalyzer implements AnalysisStrategy{

    @Override
    public Double analyze(List<Integer> data) {
        if (data == null || data.size() == 0){
            return Double.NaN;
        }
        data = data.stream()
                .sorted()
                .collect(Collectors.toList());
        int length = data.size();
        Integer rank = (int) Math.ceil(.9*length);
        return (double) data.get(rank-1);
    }
}
