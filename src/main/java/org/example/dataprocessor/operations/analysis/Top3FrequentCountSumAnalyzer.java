package org.example.dataprocessor.operations.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentCountSumAnalyzer implements AnalysisStrategy{

    @Override
    public Double analyze(List<Integer> data) {
        if (data == null || data.size() == 0) {
            return 0.0;
        }

        Map<Integer, Long> frequencyMap = new HashMap<>();

        for (Integer value : data) {
            if (frequencyMap.containsKey(value)) {
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            } else {
                frequencyMap.put(value, 1L);
            }
        }
        return (double) frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(3)
                .mapToLong(Map.Entry::getValue)
                .sum();
    }
}
