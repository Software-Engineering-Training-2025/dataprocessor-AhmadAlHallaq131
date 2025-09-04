package org.example.dataprocessor.operations.cleaning;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceNegativesWithZeroCleaner implements CleaningStrategy{

    @Override
    public List<Integer> clean(List<Integer> inputList) {
        return inputList.stream()
                .map(n -> n > 0 ? n : 0)
                .collect(Collectors.toList());
    }
}
