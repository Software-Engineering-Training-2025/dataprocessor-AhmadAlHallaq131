package org.example.dataprocessor.operations.cleaning;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativesCleaner implements CleaningStrategy{
    @Override
    public List<Integer> clean(List<Integer> inputList) {
        return inputList.stream()
                .filter(n -> n > 0 )
                .collect(Collectors.toList());
    }
}
