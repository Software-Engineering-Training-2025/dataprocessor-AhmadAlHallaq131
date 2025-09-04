package org.example.dataprocessor.operations.analysis;

import java.util.List;

public class StandardDeviationAnalyzer implements AnalysisStrategy{

    @Override
    public Double analyze(List<Integer> data) {
        if (data.size() == 0){
            return Double.NaN;
        }

        int length = data.size();
        Double mean = new MeanAnalyzer().analyze(data);

        double STD = data.stream()
                .mapToDouble(x -> Math.pow(x - mean, 2))
                .sum() / length;
        return Math.sqrt(STD);
    }
}
